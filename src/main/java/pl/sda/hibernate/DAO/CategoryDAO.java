package pl.sda.hibernate.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.hibernate.HibernateUtils;
import pl.sda.hibernate.entity.Category;

import java.util.List;

public class CategoryDAO implements DAOInterface<Category> {

    private Session currentSession;
    private Transaction currentTransaction;

    public CategoryDAO(){
        currentSession = HibernateUtils.getSession();
        currentTransaction = currentSession.beginTransaction();
    }

    public void openSession(){
        currentSession = HibernateUtils.getSession();
        currentTransaction = currentSession.beginTransaction();
    }

    public void closeCurrentSession(){
        currentTransaction.commit();
        currentSession.close();
    }

    @Override
    public Category save(Category entity) {
        currentSession.save(entity);
        return entity;
    }

    @Override
    public void update(Category entity) {

    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public void delete(Category entity) {

    }

    @Override
    public List<Category> findAll() {
        return currentSession.getNamedQuery("selectCategories").getResultList();
    }

    @Override
    public void deleteAll() {

    }
}
