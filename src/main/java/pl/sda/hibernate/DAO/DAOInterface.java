package pl.sda.hibernate.DAO;

import java.util.List;

public interface DAOInterface<T> {

    T save (T entity);
    void update(T entity);
    T findById(int id);
    void delete(T entity);
    List<T> findAll();
    void deleteAll();

}
