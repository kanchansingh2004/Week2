//Create class Employee to initialize the details.
class Employee{
    private String name;
    private int id;
    private int salary;

    //Create a constructor to initialize the details.
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //Create a method to display the details.
    public void displayDetails(){
        System.out.println("Name: "+ name +"\nID: "+ id +"\nSalary: "+ salary);
    }
}

//Create a class Manager which will inherit the Employee class.
class Manager extends Employee{
    private int teamSize;

    //Create a constructor which will take name, id, salary and teamSize as parameters.
    Manager(String name, int id, int salary, int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }

    //Create a method to display the team size.
    public void displayTeamSize(){
        System.out.println("Team Size: "+ teamSize);
    }
}

//Create a class Developer which will inherit the Employee class.
class Developer extends Employee{
    private String programmingLanguage;

    //Create a constructor which will take name, id, salary and programmingLanguage as parameters.
    Developer(String name, int id, int salary, String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage = programmingLanguage;
    }

    //Create a method to display the programming language.
    public void displayProgrammingLanguage(){
        System.out.println("Programming Language: "+programmingLanguage);
    }
}

//Create a class Intern.
class Intern{
    //Create a method to display the message.
    public void displayIntern(){
        System.out.println("Inside intern class: Just joined as intern.");
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        //Create objects of Manager and call the displayDetails and displayTeamSize method.
        Manager manager = new Manager("Jeon Jungkook", 77, 200000000, 7);
        manager.displayDetails();
        manager.displayTeamSize();

        //Create objects of Developer and call the displayDetails and displayProgrammingLanguage method.
        Developer developer = new Developer("Kanchan Singh", 26, 300000, "Java");
        developer.displayDetails();
        developer.displayProgrammingLanguage();

        //Create an object of Intern and call the displayIntern method.
        Intern intern = new Intern();
        intern.displayIntern();
    }
}
