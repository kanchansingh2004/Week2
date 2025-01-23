//Importing all required packages
import java.util.*;

//Create a class School to store the details of the school
public class School {
    // Instance Variables
    private String name;
    private ArrayList<Student> students;

    
    // Create a School class constructor to initialize School details
    public School(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    //Method to add Student to the school
    public void addStudent(Student student){
        students.add(student);
    }

    // Method to display all Students of the school
    public void displayStudents() {
        System.out.println("School Name: " + name);
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } 
        else {
            //Iterating through the list of students
            for (Student student : students) {
                student.displayStudentDetails();
                System.out.println("\nCourse Details\n");

                student.displayCourses();
            }
        }
    }

}
