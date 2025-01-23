// Create faculty class with name and department as attributes
public class Faculty {
    private String name;
    private Department department;

    // Constructor with name as parameter
    public Faculty(String name) {
        this.name = name;
        this.department = null;
    }

    // Method to get name
    public String getName() {
        return name;
    }

    // Method to get department
    public Department getDepartment() {
        return department;
    }

    // Method to add to department
    public void addToDepartment(Department department) {
        this.department = department;
        System.out.println(name + " added to the Department of " + department.getName() + ".");
    }

    // Method to remove from department
    public void removeFromDepartment(Department department) {
        if (this.department == department) {
            this.department = null;
            System.out.println(name + " removed from the Department of " + department.getName() + ".");
        }
    }

    //Method to override finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Faculty member " + name + " is being deleted.");
        super.finalize();
    }
}
