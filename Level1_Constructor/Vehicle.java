// Create a class Vehicle to represent a vehicle with the following attributes
public class Vehicle {
    String ownerName;
    String vehicleType;
    static int registractionFee;

    // Create a constructor with two parameters
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Create a static method setRegistrationFee.
    public static void setRegistrationFee(int fee) {
        registractionFee = fee;
    }

    // Create displayVehicleDetails method to display the owner name, vehicle type and registration fee
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registractionFee);
    }
}
