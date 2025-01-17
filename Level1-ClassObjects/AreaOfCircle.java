//Create AreaOfCircle to take radius
class AreaOfCircle{
    double radius;

    AreaOfCircle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.println("The area is " + Math.PI * radius * radius);
    }
    void circumference(){
        System.out.println("The circumference is " + 2 * Math.PI * radius);
    }
}