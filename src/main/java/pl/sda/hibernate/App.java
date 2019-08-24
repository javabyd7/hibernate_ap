package pl.sda.hibernate;

import pl.sda.hibernate.Service.CategoryService;
import pl.sda.hibernate.entity.Author;
import pl.sda.hibernate.entity.Book;
import pl.sda.hibernate.entity.Category;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CategoryService categoryService = new CategoryService();
        BookDAO bookDAO = new BookDAO();
        Category category = new Category("Horror");
        Author author = new Author("Romanski","Jarek");
        Set<Author> authors = new HashSet<>();
        authors.add(author);
        Book book = new Book("DUPA",category,authors);
        bookDAO.insertBook(book);

        System.out.println("--------------------");
        System.out.println(bookDAO.findAllBooks());

        Category category1 = new Category("Kryminal");
        categoryService.save(category1);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println(categoryService.findAll());





    }
}
