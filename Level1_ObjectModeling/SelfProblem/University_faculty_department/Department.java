//Importing required packages
import java.util.ArrayList;
import java.util.List;

// Department class (Aggregation with Faculty, Composition with University)
public class Department {
    private String name;
    private List<Faculty> facultyMembers;

    // Constructor with name as parameter
    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    // Method to get name
    public String getName() {
        return name;
    }

    // Method to add faculty
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
        faculty.addToDepartment(this);
    }

    // Method to remove faculty
    public void removeFaculty(Faculty faculty) {
        facultyMembers.remove(faculty);
        faculty.removeFromDepartment(this);
    }

    public List<Faculty> getFacultyMembers() {
        return facultyMembers;
    }

    // Destructor-like method for cleaning up
    public void clearFaculty() {
        for (Faculty faculty : facultyMembers) {
            faculty.removeFromDepartment(this);
        }
    }

    // Method to override finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Department " + name + " is being deleted.");
        clearFaculty();
        super.finalize();
    }

    //create method to add employee
    public void addEmployee(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addEmployee'");
    }

    public void displayDepartmentDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayDepartmentDetails'");
    }

    public void displayEmployees() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayEmployees'");
    }
}
