// Simulate the object model of a University, Faculty, and Department
public class UniversityFacultyDepartmentMain {
    public static void main(String[] args) {
        // Create University
        University university = new University("Tech University");

        // Create Department class objects
        Department csDept = new Department("Computer Science");
        Department eeDept = new Department("Electrical Engineering");

        // Create Faculty members using Faculty class
        Faculty profSmith = new Faculty("Prof. Smith");
        Faculty profJohnson = new Faculty("Prof. Johnson");
        Faculty profTaylor = new Faculty("Prof. Taylor");

        // create method to add Departments to University
        university.addDepartment(csDept);
        university.addDepartment(eeDept);

        // create method to add Faculty to Departments (Aggregation)
        csDept.addFaculty(profSmith);
        eeDept.addFaculty(profJohnson);
        eeDept.addFaculty(profTaylor);

        // Deleting the University and see the impact on Departments
        university.removeDepartment(csDept);

        //Faculty member leaving a Department
        eeDept.removeFaculty(profJohnson);

        // Deleting the University
        university = null;  // To trigger garbage collection
        System.gc();  // Manually request garbage collection to invoke finalize methods
    }
}
