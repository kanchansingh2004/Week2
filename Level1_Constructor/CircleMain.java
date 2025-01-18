//Import Scanner class for taking input from user.
import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        //Create object to take input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();

        //Pass value and call method .
        Circle area = new Circle(radius);
        area.area();

        sc.close();
    }
}
