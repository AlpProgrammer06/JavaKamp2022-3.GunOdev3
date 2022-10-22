package dataAccess.concretes.hibernate;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hiberanate ile eklendi : " + instructor.getFirstName() +
                " " +  instructor.getLastName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hiberanate ile güncellendi : " + instructor.getFirstName() + " " +  instructor.getLastName());
    }

    @Override
    public void delete(Long id) {
        System.out.println("Hibernate ile silindi" + id);
    }
}
