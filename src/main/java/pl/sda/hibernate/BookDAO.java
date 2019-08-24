package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.hibernate.entity.Book;

import java.util.List;

public class BookDAO {

    public  Book insertBook(Book book){
        Transaction transaction = null;
        try(Session session = HibernateUtils.getSession()) {
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return book;
    }

    public List<Book> findAllBooks(){
        Session session = HibernateUtils.getSession();
        //List<Book> book = session.createQuery("select b from Book b",Book.class)
          //      .getResultList();
        List books = session.getNamedQuery("selectBooks").getResultList();
        return books;


    }

}
