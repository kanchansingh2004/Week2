//Create EmployeeDetails to take employee details
class EmployeeDetails{
    String name;
    float salary;
    int id;
    //Create constructor for input data
    EmployeeDetails(String name, int id, float salary){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    ///Create a display method to show data.
    void display(){
        System.out.println("Employee name:" + name);
        System.out.println("Employee id:" + id);
        System.out.println("Employee salary:" + salary);
    }
}
