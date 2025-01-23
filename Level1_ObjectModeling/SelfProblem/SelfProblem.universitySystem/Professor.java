//Importing the required packages
import java.util.ArrayList;
import java.util.List;

//creating the class professor
public class Professor {
    private String name;
    private List<Course> courses;

    //Create constructor of professor
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    //method for adding course
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    //method for getting all courses
    public List<Course> getCourses() {
        return courses;
    }
    // create getter for name
    public String getName() {
        return name;
    }
}
