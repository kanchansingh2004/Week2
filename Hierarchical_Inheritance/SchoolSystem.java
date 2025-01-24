//create a class Person with the following attributes: name, age
class Person{
    private String name;
    private int age;

    //Create a constructor that initializes the attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //create a method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

//create a class Teacher that extends Person with the following attributes: subject
class Teacher extends Person{
    private String subject;

    //Create a constructor that initializes the attributes
    public Teacher(String name, int age, String subject) {
        super(name,age);
        this.subject = subject;
    }
    @Override
    //create a method to display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

//create a class Student that extends Person with the following attributes: grade
class Student extends Person{
    private int grade ;

    //create a constructor that initializes the attributes
    public Student(String name, int age , int grade) {
        super(name, age );
        this.grade = grade;
    }
    @Override
    //create a method to display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

//create a class Staff that extends Person with the following attributes: areaOfWork
class Staff extends Person{
    private String areaOfWork;

    //create a constructor that initializes the attributes
    public Staff(String name, int age, String areaOfWork) {
        super(name, age );
        this.areaOfWork = areaOfWork;
    }
    @Override
    //display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Area Of Work: " + areaOfWork);
    }
}

//create a class SchoolSystem with the main method
public class SchoolSystem {
    public static void main(String[] args) {
        //create a object for Teacher class
        Teacher teacher = new Teacher("Mr. Jeon", 28,"Korean");
        //displaying details of teacher
        teacher.displayDetails();

        //create a object for Student class
        Student student = new Student("Kanchan singh", 20, 11);
        //displaying details of student
        student.displayDetails();
        
        //create a object for Staff class 
        Staff staff = new Staff("Mr. Kim", 29, "Painting");
        //displaying details of staff
        staff.displayDetails();
        
    }
}
