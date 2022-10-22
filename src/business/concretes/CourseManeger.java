package business.concretes;

import business.abstracts.CourseService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManeger implements CourseService {

    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses =new ArrayList<>();


    public CourseManeger(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers =loggers;
    }

    @Override
    public void add(Course course) throws Exception {

        for(Course  course1 : courses){
            if (course1.getName()==course.getName()){
               throw new Exception("Aynı kurs ismi kullanılamaz");
            }
        }
        if(course.getPrice()<0){
          throw new Exception("Kursun fiyatı 0 dan küçük olamaz.");
        }
        courseDao.add(course);

    }
}
