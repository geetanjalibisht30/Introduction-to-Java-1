package com.TTN.relationship;

import com.TTN.relationship.entity.Address;
import com.TTN.relationship.entity.Author;
import com.TTN.relationship.entity.Book;
import com.TTN.relationship.entity.Subject;
import com.TTN.relationship.repository.BookRepository;
import com.TTN.relationship.repository.Repository;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.Subgraph;
import java.util.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class RelationshipApplicationTests {


	@Autowired
	Repository repository;

	@Autowired
	BookRepository bookRepository;

	@Autowired
	EntityManager entityManager;

	@Test
	void contextLoads() {
	}

	private Logger logger= LoggerFactory.getLogger(this.getClass());

	//Introduce a List of subjects for author.
	@Test
	public void testCreateSubjectList() {
		Author author = new Author();
		author.setId(6);
		author.setAuthorname("Paul Deck");

		Address address = new Address();
		address.setStreetNumber(56);
		address.setLocation("Noida");
		address.setState("UP");


		author.getSubjectList().add("Java");
		author.getSubjectList().add("Python");
		author.getSubjectList().add("SQL");

		author.setAddress(address);

		repository.save(author);
	}


	/*
	//one to one mapping
	//Implement One to One mapping between Author and Book.
	@Test
	public void testOneToOneCreateBook() {
		Book book = new Book();
		book.setId(21);
		book.setBookname("Java");

		Author author = new Author();
		author.setId(211);
		author.setAuthorname("Geeta");

		Address address1 = new Address();
		address1.setStreetNumber(66);
		address1.setLocation("Noida");
		address1.setState("UP");

		//saving embedded in our table
		author.setAddress(address1);


		book.setAuthor(author);
		bookRepository.save(book);


	}

	 */


	/*//one to many
	@Test
	public void testOnetoMany() {
		Author author = new Author();
		author.setId(123);
		author.setAuthorname("Sql");

		Address address2 = new Address();
		address2.setStreetNumber(64);
		address2.setLocation("Bihar");
		address2.setState("UP");

		//saving embedded in our table
		author.setAddress(address2);

		Set<Book> books = new HashSet<Book>();
		Book book=new Book();
		book.setId(10);
		book.setBookname("C++");

		books.add(book);

		author.setBooks(books);

		repository.save(author);

	}

	 */



	//Implement Many to Many Mapping between Author and Book.
	@Test
	public void testManyToMany()
	{
		Author author=new Author();
		author.setId(123);
		author.setAuthorname("The Hidden Spring");

		Address address3 = new Address();
		address3.setStreetNumber(68);
		address3.setLocation("Nainital");
		address3.setState("Uttarakhand");

		//saving embedded in our table
		author.setAddress(address3);


		Set<Book> books1 = new HashSet<Book>();
		Book book4=new Book();
		book4.setId(21);
		book4.setBookname("C++");
		books1.add(book4);



	   author.setBook(books1);

       repository.save(author);


	}
	//Which method on the session object can be used to remove an object from the cache?

	//for level 1 caching to work, we need to mark it with @Transactional from spring package,
	// Spring creates level 1 caching for the Spring session associated with the transaction and for it to work we need to mark it with this annotation.
	//Evict method is used on the session object to remove an object from the cache.
	@Test
	@Transactional
	public void testEvict() {
		Session session = entityManager.unwrap(Session.class);
		Author curr =repository.findById(6).get();
		repository.findById(6);

		//If comment this part only 1 select query will show in console.
		session.evict(curr);

		repository.findById(6);
	}


//What does @transactional annotation do?

	//@Transactional annotation is used
	// when you want the certain method/class(=all methods inside) to be executed in a transaction.
	@Test
	@Transactional
	public void testCaching() {
		repository.deleteById(123);

	}

}
