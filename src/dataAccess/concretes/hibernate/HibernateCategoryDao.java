package dataAccess.concretes.hibernate;

import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.CourseDao;
import entities.Category;
import entities.Course;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hiberanate ile eklendi " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Hiberanate ile güncellendi " + category.getName());
    }

    @Override
    public void delete(Long id) {
        System.out.println("Hiberanate ile " + id + ". kategori silindi " );
    }


}
