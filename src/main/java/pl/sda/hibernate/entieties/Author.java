package pl.sda.hibernate.entieties;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Author{

    @Id
    @GeneratedValue
    private int id;
    private String lastName;
    private String name;
    @ManyToMany(mappedBy = "authors")
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<Book> books;
}
