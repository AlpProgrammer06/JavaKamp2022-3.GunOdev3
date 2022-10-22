package dataAccess.concretes.hibernate;

import dataAccess.abstracts.CourseDao;
import entities.Category;
import entities.Course;

public class HiberanateCourseDao implements CourseDao {


    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile eklendi : " + course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile güncellendi : " + course.getName());
    }


    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile silindi : " + course.getName());
    }


}
