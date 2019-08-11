package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static SessionFactory sessionFactory = null;

    private HibernateUtils() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static Session getSession() {
        if (sessionFactory == null) {
            new HibernateUtils();
        }
        return sessionFactory.openSession();
    }
}