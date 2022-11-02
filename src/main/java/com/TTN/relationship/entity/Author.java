package com.TTN.relationship.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {



    @Id//our primary key
    @Column(name="author_id")
    private int id;
    private String authorname;

/*
    //FOR ONE TO ONE MAPPING
    @OneToOne(mappedBy = "author")
    private Book book;

 */

   //one to many
    //bidirectional as we  used many to one in the book entity
    //unidirectional when we don't use many to one in book entity
    /*
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
  	private Set<Book> books;

     */

    //many to many mapping
   /* @ManyToMany(cascade = CascadeType.ALL)//cascading effect delete/save them at same time save viceverca
    @JoinTable(
            name="authors_books", joinColumns = @JoinColumn(name = "authorid"),
            inverseJoinColumns = @JoinColumn(name = "bookid")
           )*/

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "authors_books",
            joinColumns = {
                    @JoinColumn(name = "author_id")//the name of the column in the third table
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "book_id" )//the name of the column in the third table
            }//they both are related to  the author and book table
    )

    private Set<Book> book;


    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }


    @Embedded
    //mappped to Address class
    private Address address;



    @ElementCollection//automatic creation
    //An ElementCollection can be used to define a one-to-many relationship to an Embeddable object,
    private List<String> subjectList =new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }




    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public List<String> getSubjectList() {
        return subjectList;
    }
    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }



    /*
  //for one to one mapping
  public Book getBook() {
        return book;
    }

    /*
    public void setBook(Book book) {
        this.book = book;
    }



    //for one to many
    public Set<Book> getBooks() {
        return books;
    }
    public void setBooks(Set<Book> books) {
        this.books = books;
    }
*/

}
