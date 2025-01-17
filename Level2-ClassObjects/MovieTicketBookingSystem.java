//import Scanner and Random class for input and generating random number respectively
import java.util.Random;
import java.util.Scanner;

//Create MovieTicketBookingSystem for passing values.
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Create random charater and number to assign seats for object 1.
    Random random = new Random();
    int randomNumberForChar = random.nextInt(26);
    char randomChar = (char)('A' + randomNumberForChar);
    int randomNumber =(int)((Math.random() * 90) + 10);
    String seat = randomChar + Integer.toString(randomNumber);
    MovieTicket movie1 = new MovieTicket("Moana2", seat, 160);

    //Create random charater and number to assign seats for object 2.
    randomNumberForChar = random.nextInt(26);
    randomChar = (char)('A' + randomNumberForChar);
    randomNumber =(int)((Math.random() * 90) + 10);
    seat = randomChar + Integer.toString(randomNumber);
    MovieTicket movie2 = new MovieTicket("Five Feet Apart", seat, 200);
    
    //Call class methods using object.
    movie1.display();
    movie2.display();

    sc.close();
    }
}
