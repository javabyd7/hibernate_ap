package pl.sda.hibernate.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.hibernate.HibernateUtils;
import pl.sda.hibernate.entieties.Book;

import java.util.List;

public class BookDAO {

    public Book insert(Book book) {
        try (Session session = HibernateUtils.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        }
        return book;
    }

    public List<Book> findAll() {
        return HibernateUtils.getSession().getNamedQuery("selectBooks").getResultList();
    }
}