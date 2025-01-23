//import package arraylist and list to use ArrayList and List
import java.util.ArrayList;
import java.util.List;

// University class (Composition with Department)
public class University {
    private String name;
    private List<Department> departments;

    //create constructor with name as parameter
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    //create method to get name
    public String getName() {
        return name;
    }

    //create method to get department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    //create method to remove department
    public void removeDepartment(Department department) {
        if (departments.contains(department)) {
            departments.remove(department);
            department.clearFaculty();  // Remove faculty members from the department
            System.out.println("Department " + department.getName() + " removed from the University.");
        }
    }

    //create method to get department
    @Override
    protected void finalize() throws Throwable {
        System.out.println("University " + name + " is being deleted.");
        for (Department department : departments) {
            department.clearFaculty();  // Clean up all faculty members from the department
        }
        super.finalize();
    }
}
