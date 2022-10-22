import business.abstracts.CategoryService;
import business.abstracts.CourseService;
import business.abstracts.InstructorService;
import business.concretes.CategoryManager;
import business.concretes.CourseManeger;
import business.concretes.InstructorManeger;
import core.logging.abstracts.Logger;
import core.logging.concretes.DatabaseLogger;
import core.logging.concretes.FileLogger;
import core.logging.concretes.MailLogger;
import dataAccess.concretes.hibernate.HibernateCategoryDao;
import dataAccess.concretes.jdbc.JdbcCourseDao;
import dataAccess.concretes.jdbc.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        System.out.println("------------------");
        System.out.println(" EĞİTMEN ");
        System.out.println("-----------------------");
        Instructor instructor1 = new Instructor(1L,"Aslan","BALCI" );
        InstructorService instructorService = new InstructorManeger(new JdbcInstructorDao(),loggers);
        instructorService.add(instructor1);
        //instructorService.add(new Instructor(2L,"Ali", "BOZLAK" )); bu şekilde de eğitmen eğitmen nesnesi oluşturabiliriz





        System.out.println(" KATEGORİLER ");
        System.out.println("------------------");
        Category category1 = new Category(1L, "Programlama ");
        Category category2 = new Category(2L, "Programlama2");
        CategoryService categoryService = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryService.add(category1);
        System.out.println("----------------------------");
        categoryService.add(category2);


        System.out.println("-------------------------");
        System.out.println(" KURSLAR ");
        System.out.println("-------------------------");
        Course course1 =new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (Java/React)",450,instructor1,category1);
        Course course2 =new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (Java/React)",500,instructor1,category1);
        CourseService courseService = new CourseManeger(new JdbcCourseDao(),loggers);
        courseService.add(course1);
        courseService.add(course2);






    }


}