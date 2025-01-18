// Create a class Course with the following attributes
public class CourseManagement {
    public static void main(String[] args) {
        
        // Create an object of Course with the name course1
        Course course1 = new Course("Java", 3, 1000);

        // Call the displayCourseDetails method on course1
        course1.displayCourseDetails();

        // Call the updateInstituteName method on course1
        Course.updateInstituteName("ABC Institute");

        // Call the displayCourseDetails method on course1
        course1.displayCourseDetails();
    }
}
