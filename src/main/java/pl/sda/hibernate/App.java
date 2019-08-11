package pl.sda.hibernate;

import pl.sda.hibernate.dao.BookDAO;
import pl.sda.hibernate.entieties.Book;

import java.util.List;

public class App {
    public static void main(String[] args) {

        /*Book book = new Book();
        book.setTitle("Metafizyka zycia i smierci");

        Category category = new Category();
        category.setName("Filozofia");

        book.setCategory(category);

        Author author = new Author();
        author.setName("Arthur");
        author.setLastName("Schopenhauer");

        book.setAuthors(new HashSet<>(Arrays.asList(author)));

        Book insertedBook = new BookDAO().insert(book);*/
        List<Book> books = new BookDAO().findAll();
        books.forEach(b -> System.out.println(b.getTitle()));
    }
}