package pl.sda.hibernate.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@NoArgsConstructor
public class Author {

    public Author(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }

    @Id
    @GeneratedValue()
    private int id;
    private String lastName;
    private String name;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;


}
