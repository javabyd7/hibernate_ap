package pl.sda.hibernate.entieties;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Category category;
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<Author> authors;

}
