package pl.sda.hibernate.entieties;

import lombok.Getter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private int id;
    @Getter
    private String title;
    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    private Category category;
    @ManyToMany
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<Author> authors;
}
