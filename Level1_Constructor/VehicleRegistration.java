public class VehicleRegistration {
    public static void main(String[] args) {
        
        // Create an object of Vehicle with the name vehicle1
        Vehicle vehicle1 = new Vehicle("Zeesha", "Scooty");

        //Initialize the registration fee to 2000
        Vehicle.setRegistrationFee(2000);

        // Call the displayVehicleDetails method on vehicle1
        vehicle1.displayVehicleDetails();

        // Call the setRegistrationFee method on Vehicle
        Vehicle.setRegistrationFee(5000);

        // Call the displayVehicleDetails method on vehicle1
        vehicle1.displayVehicleDetails();
    }
}
