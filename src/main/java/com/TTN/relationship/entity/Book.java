package com.TTN.relationship.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="book")
public class Book {

    @Id
    @Column(name="book_id")
    private int id;
    private String bookname;



    /*
    for one to one mapping
    @OneToOne(cascade = CascadeType.ALL)//they will relate like delete in this and then delete in other
    @JoinColumn(name="b_id")
    private Author author;

     */

    //Implement One to Many Mapping between Author
    // and Book(Unidirectional, BiDirectional and without additional table ) and implement cascade save.

   /* @ManyToOne
    @JoinColumn(name="b_id")
    private Author author;

*/

    //many to many
    @ManyToMany(mappedBy = "book")
    private List<Author> authors;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    /*
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

     */
}
