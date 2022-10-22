package business.concretes;

import business.abstracts.CategoryService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;   //https://medium.com/@ali_bozlak/javada-interfaceler-875be8e0d89a
    private Logger[] loggers;
    private List<Category> categories=new ArrayList<>();



    //iş kuralları ile ilgili değişiklikler busines paketinde managerde değişiklik ile yapılır.

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;

    }

    @Override // buraya  iş kurallarını yazdık
    public void add(Category category) throws Exception {
        for (Category category1 : categories) {
            if (category1.getName() == category.getName()) {
                throw new Exception("Aynı kategori adı kullanılamaz");
            }
        }
        categoryDao.add(category);
        for(Logger logger : loggers){
            logger.log("Kategori kaydedildi.");
        }

    }
}


