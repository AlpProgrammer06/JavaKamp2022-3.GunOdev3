package business.concretes;

import business.abstracts.InstructorService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManeger implements InstructorService {
    private InstructorDao instructorDao;
    private Logger[] loggers;
    //private List<Instructor> instructors;

    public InstructorManeger(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        //this.instructors = instructors;
    }


     @Override
    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for (Logger logger : loggers){
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }

    }
}
