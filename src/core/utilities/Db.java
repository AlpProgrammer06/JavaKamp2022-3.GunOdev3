package core.utilities;

import entities.Category;
import entities.Course;
import entities.Instructor;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;

public class Db{
    public static List<Instructor> instructors = new ArrayList<>();
    public static List<Category> categories = new ArrayList<>();
    public static List<Course> courses = new ArrayList<>();
}
