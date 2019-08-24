package pl.sda.hibernate.Service;

import pl.sda.hibernate.DAO.CategoryDAO;
import pl.sda.hibernate.entity.Category;

import java.util.List;

public class CategoryService {

    private CategoryDAO categoryDAO;

    public CategoryService(){
        categoryDAO = new CategoryDAO();
    }

    public void save(Category category){
        // Validate
        categoryDAO.openSession();
        categoryDAO.save(category);
        categoryDAO.closeCurrentSession();
    }

    public List<Category> findAll(){
        categoryDAO.openSession();
        List categories = categoryDAO.findAll();
        categoryDAO.closeCurrentSession();
        return categories;
    }
}
