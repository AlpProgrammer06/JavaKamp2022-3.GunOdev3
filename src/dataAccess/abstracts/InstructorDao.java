package dataAccess.abstracts;

import entities.Category;
import entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);
    void update(Instructor instructor);
    void delete(Long id);
}
