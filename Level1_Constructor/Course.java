// Create a class Course with the following private attributes
public class Course {
    String courseName;
    int duration;
    double fee;
    // Create a static attribute instituteName 
    static String instituteName = "XYZ Institute";

    // Create a constructor with three parameters
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    
    // Create a constructor with three parameters
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Create a method updateInstituteName which takes a string parameter and updates the instituteName
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
