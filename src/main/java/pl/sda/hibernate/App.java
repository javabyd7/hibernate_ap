package pl.sda.hibernate;

import pl.sda.hibernate.dao.BookDAO;
import pl.sda.hibernate.entieties.Author;
import pl.sda.hibernate.entieties.Book;
import pl.sda.hibernate.entieties.Category;

import java.util.Arrays;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Opowiesc podrecznej");

        Category category = new Category();
        category.setName("Dystopia");

        book.setCategory(category);

        Author author = new Author();
        author.setName("Margaret");
        author.setLastName("Atwood");

        book.setAuthors(new HashSet<>(Arrays.asList(author)));

       Book insertedBook = new BookDAO().insertBook(book);
        System.out.println(insertedBook.getTitle());
    }
}