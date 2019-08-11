package pl.sda.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.hibernate.HibernateUtils;
import pl.sda.hibernate.entieties.Book;

public class BookDAO {

    public Book insertBook(Book book) {
        try (Session session = HibernateUtils.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        }
        return book;
    }
}
