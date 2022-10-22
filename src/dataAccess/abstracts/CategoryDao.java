package dataAccess.abstracts;

import entities.Category;

public interface CategoryDao {
    void add(Category category);
    void update(Category category);
    void delete(Long id);
}
