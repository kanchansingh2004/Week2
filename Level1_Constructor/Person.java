//Create person class to take the person's attribute.
public class Person {
    //Class data members
    private String name;
    private int age;

    //Parameterized constructor to assign value to members
    Person(String name, int age){
        System.out.println("Parameterized Constructor");
        this.name = name;
        this.age = age;
    }

    //Copy constructor to assign value to members of another object
    Person(Person p){
        System.out.println("Copy Constructor");
        this.name = p.name;
        this.age = p.age;
    }

    //MEthod to display the person name and age
    void display(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}
