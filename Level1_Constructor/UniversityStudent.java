// Create a class UniversityStudent with the following private attributes
public class UniversityStudent {
    public String rollNumber;
    protected String name;
    private int CGPA;

    // Create a getter and setter for the CGPA attribute
    public int getCGPA() {
        return CGPA;
    }
    public void setCGPA(int CGPA) {
        this.CGPA = CGPA;
    }

    // Create a method displayDetails that displays the details of the student
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

// Create a class PostGraduatedStudent that extends UniversityStudent
class PostGraduatedStudent extends UniversityStudent{
    // Create a constructor that takes in the following parameters
    PostGraduatedStudent(String rollNumber, String name, int CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        setCGPA(CGPA);
    }
}
