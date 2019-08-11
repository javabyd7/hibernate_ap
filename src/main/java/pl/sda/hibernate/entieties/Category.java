package pl.sda.hibernate.entieties;

import lombok.Getter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
public class Category {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(mappedBy = "category")
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<Book> books;
}