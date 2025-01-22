//Create a class Employee to initialize a Employee details.
public class Employee {
    //Create data members to store details.
    static String companyName;
    private String name;
    final private int id;
    private String designation;
    //Variable to calculate total patient
    static int totalEmployee = 0;

    //Constructor to initialize values using this keyword
    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    //Count the total employee
    static void getTotalEmployees(){
        System.out.println("Total Employees are : " + totalEmployee);
    }

    //Display the details.
    void display(){
        System.out.println("Employee Name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee designation : " + designation);
    }

}
