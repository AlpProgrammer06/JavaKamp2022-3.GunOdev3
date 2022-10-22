package dataAccess.concretes.jdbc;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Jdbc ile güncellendi : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void delete(Long id) {
        System.out.println("Jdbc ile silindi : " + id);
    }
}
