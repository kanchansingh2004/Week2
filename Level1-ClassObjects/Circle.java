import java.util.Scanner; // Import Scanner class for user input

public class Circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();

        AreaOfCircle area1 = new AreaOfCircle(radius);
        area1.area();
        area1.circumference();

        sc.close();
    }
}
