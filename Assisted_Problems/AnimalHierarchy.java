//create a class Animal. The class will have a method makeSound which will print "Animal make sound".
class Animal{
    protected String name;
    protected int age;

    //Create a method makeSound which will print "Animal make sound".
    public void makeSound(){
        System.out.println("Animal make sound");
    }

        //Create a method display which will print the name and age of the animal.
    public void display(){
        System.out.println("Name: "+ name +"\nAge: "+ age);
    }
}

//Create a class Dog which will inherit the Animal class.
class Dog extends Animal{
    //Create a constructor which will take name and age as parameters.
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Override the makeSound method and print "Dog Barks!!!".
    @Override
    public void makeSound(){
        System.out.println("Dog Barks!!!");
    }
}

//Create a class Cat which will inherit the Animal class.
class Cat extends Animal{
    //Create a constructor which will take name and age as parameters.
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Override the makeSound method and print "Cat Meows".
    @Override
    public void makeSound(){
        System.out.println("Cat Meows");
    }
}

//Create a class Bird which will inherit the Animal class.
class Bird extends Animal{
    //Create a constructor which will take name and age as parameters.
    Bird(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Override the makeSound method and print "Bird Chirps".
    @Override
    public void makeSound(){
        System.out.println("Bird Chirps");
    }
}

public class AnimalHierarchy{
    public static void main(String[] args) {
        //Create an object of Dog class and call the display and makeSound method.
        Animal dog = new Dog("Sheero", 7);
        dog.display();
        dog.makeSound();
        
        //Create an object of Cat class and call the display and makeSound method.
        Animal cat = new Cat("Lily", 4);
        cat.display();
        cat.makeSound();

        //Create an object of Bird class and call the display and makeSound method.
        Animal bird = new Bird("Chi", 6);
        bird.display();
        bird.makeSound();
    }
}