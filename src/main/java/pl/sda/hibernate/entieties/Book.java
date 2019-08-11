package pl.sda.hibernate.entieties;

import lombok.Getter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@NamedQueries({
        @NamedQuery(
                name = "selectBooks",
                query = "SELECT DISTINCT b from Book b " +
                        "JOIN FETCH b.authors " +
                        "JOIN FETCH b.category"
        )
})
public class Book {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    private Category category;
    @ManyToMany
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<Author> authors;
}
