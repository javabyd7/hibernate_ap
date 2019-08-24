package pl.sda.hibernate.entity;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;


@Entity
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(
                name = "selectBooks",
                query = "SELECT DISTINCT b FROM Book b" +
                        " JOIN FETCH b.authors" +
                        " JOIN FETCH b.category"
        )
})
public class Book {

    public Book(String title, Category category, Set<Author> author) {
        this.title = title;
        this.category = category;
        this.authors = author;
    }

    @Id
    @GeneratedValue
    private int id;
    private String title;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Category category;
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Set<Author> authors;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", authors=" + authors +
                '}';
    }
}
