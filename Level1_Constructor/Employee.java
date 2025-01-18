// Create a class Employee with the following attributes
public class Employee{
    public int employeeID;
    protected String department;
    private double salary;

    // Create a getter and setter for the salary attribute
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Create a method displayDetails that displays the details of the employee
    public void displayDetails() {
        System.out.println("employeeID: " + employeeID);
        System.out.println("department: " + department);
        System.out.println("salary: " + getSalary());
    }
}

// Create a class Manager that extends Employee
class Manager extends Employee{
    // Create a constructor that takes in the following parameters
    Manager(String department, int employeeID, double salary){
        this.department = department;
        this.employeeID = employeeID;
        setSalary(salary);
    }
}


