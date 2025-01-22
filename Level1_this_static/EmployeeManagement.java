//Create a class EmployeeManagement to pass values of an employee
public class EmployeeManagement {
    public static void main(String[] args) {
        //Create class objects.
        Employee emp1 = new Employee("Kanchan", 1234, "Senior Analyst");
        Employee emp2 = new Employee("Kaavy", 1222, "Senior Analyst");

        //Check the instance of parent class.
        if(emp1 instanceof Employee && emp2 instanceof Employee){
            System.out.println("emp1 and emp2 are instance of BankAccountDetails");
        }
        else{
            System.out.println("emp1 and emp2 is not an instance of BankAccountDetails");
        }

        //Display the details.
        emp1.display();
        emp2.display();

        //Get the total number of employee from getTotalEmployees mathod.
        Employee.getTotalEmployees();
    }
}
