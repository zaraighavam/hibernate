package hibernate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Library")
public class Library {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "book_id")
    private Set<Book> books=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    //todo
//    public static void main(String[] args){
//        Book book1 = new Book();
//        book1.setTitle( "High-Performance Java Persistence" );
//
//        Book book2 = new Book();
//        book2.setTitle( "Java Persistence with Hibernate" );
//
//        Library library = doInJPA( this::entityManagerFactory, entityManager -> {
//            Library _library = entityManager.find( Library.class, 1L );
//
//            _library.getBooks().add( book1 );
//            _library.getBooks().add( book2 );
//
//            return _library;
//        } );
//
//        assertFalse( library.getBooks().contains( book1 ) );
//        assertFalse( library.getBooks().contains( book2 ) );
//    }
}
