package dataAccess.abstracts;

import entities.Category;
import entities.Course;

public interface CourseDao {
    void add(Course course);
    void update(Course course);

    void delete(Course course);


}
