package Day6.Level1_Polymorphism_Encapsulation.RideHailingApplication;

// Importing required classes
import java.util.ArrayList;

public class RideHailing{
    public static void main(String[] args) {
        // Creating an ArrayList of Vehicle type
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Creating objects of Car, Bike and Auto classes
        Vehicle car=new Car("Kushu","Car2233","petrol",70);
        ((GPS) car).updateLocation("MP Nagar");
        Vehicle bike=new Bike("Jennie","Bike7777","Petrol",40);
        ((GPS) bike).updateLocation("New Market");
        Vehicle auto=new Auto("Kallu","Auto5675","E-rickshaw",50);
        ((GPS) auto).updateLocation("Chowk Bazar");

        // Adding the objects to the ArrayList
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Looping through the ArrayList and calling the getVehicleDetails() and calculateFare() methods
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            if(vehicle instanceof GPS){
                System.out.println(((GPS) vehicle).getCurrentLocation());
            }
            double fare = vehicle.calculateFare(30);
            System.out.println("Fare for the ride :- " + fare);
            System.out.println();
        }
    }
}
