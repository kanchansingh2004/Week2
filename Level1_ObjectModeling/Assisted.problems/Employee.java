// Create a class Employee with the following private instance variables
public class Employee {
    // Instance Variables
    private String name;
    private final String ID;

    // Constructor to initialize Employee details
    public Employee(String name,String ID) {
        this.name = name;
        this.ID = ID;
    }

    //Create a method to get the name of the Employee
    public String getName(){
        return this.name;
    }

    //Create a method to get the ID of the Employee
    public String getID(){
        return this.ID;
    }

    // Method to display the details of Employee
    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details\n");
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.ID);
        
    }

}
