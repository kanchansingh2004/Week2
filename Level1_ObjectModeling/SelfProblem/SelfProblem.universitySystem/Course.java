//Importing the required packages
import java.util.ArrayList;
import java.util.List;

//create class course
public class Course {
    //declaring variables
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    //create constructor of course
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    //method for assigning professor
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
    }
    //method for enrolling the student
    public void enrollStudent(Student student) {
        this.enrolledStudents.add(student);
        student.addCourse(this);
    }
    //method for getting course name
    public String getCourseName() {
        return courseName;
    }
    //method for getting professor name 
    public Professor getProfessor() {
        return professor;
    }
    //method for adding student details
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void displayCourseDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayCourseDetails'");
    }
    public void displayStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }
    public void addStudent(String name, int roll_NUMBER) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addStudent'");
    }
}
