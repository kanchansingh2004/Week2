//Importing List and ArrayList
import java.util.ArrayList;
import java.util.List;
//creating class student
public class Student {
    private String name;
    private List<Course> courses;

    //Create constructor of student
    public Student(String name, int rollNUMBER) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public Student(String string) {
        //TODO Auto-generated constructor stub
    }
    
    //method for adding course
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    //method for getting all courses
    public List<Course> getCourses() {
        return courses;
    }
    //create getter for name
    public String getName() {
        return name;
    }
    //method to throw exception
    public void displayStudentDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudentDetails'");
    }
    public void displayCourses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayCourses'");
    }
}
