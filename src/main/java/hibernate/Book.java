package hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity(name = "Book")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }else if (obj==null || getClass()!=obj.getClass() ){
            return false;
        }else{
            return this.getId().equals(((Book)obj).getId());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
