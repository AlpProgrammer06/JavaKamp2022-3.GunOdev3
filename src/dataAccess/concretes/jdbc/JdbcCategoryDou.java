package dataAccess.concretes.jdbc;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class JdbcCategoryDou implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile eklendi : " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Jdbc ile güncellendi : " + category.getName());
    }

    @Override
    public void delete(Long id) {
        System.out.println("jdbc ile silindi : " + id);
    }
}
