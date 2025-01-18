//Create class circle to initialize radius using constructor
public class Circle {
    //Class data member
    private double radius;

    //Default constructor
    Circle(){
        System.out.println("Default constructor \nProvide some radius for circle");
    }

    //Parameterized constructor.
    Circle(double radius){
        this.radius = radius;
    }
    //Calculate area for some output using radius.
    void area(){
        System.out.println("The area is " + Math.PI * radius * radius);
    }
}
