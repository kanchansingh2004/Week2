//Create a class Vehicle with the following attributes and methods:
class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Create a constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Create an interface Refuelable with an abstract method refuel
interface Refuelable {
    void refuel(); // Abstract method
}

// create two subclasses of Vehicle: ElectricVehicle and PetrolVehicle
// Subclass 1: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Create a constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println(model + " is charging with a battery capacity of " + batteryCapacity + " kWh.");
    }
}

// Subclass 2: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // in liters

    // create a constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    // Implement the refuel method from Refuelable
    @Override
    public void refuel() {
        System.out.println(model + " is refueling with a fuel capacity of " + fuelCapacity + " liters.");
    }
}

// Create a VehicleManagement class to test the classes
public class VehicleManagement {
    public static void main(String[] args) {
        // Create an ElectricVehicle object
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 200, 75);
        tesla.displayDetails();
        tesla.charge();
        System.out.println("------------------------------------------------");

        // Create a PetrolVehicle object
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 180, 50);
        honda.displayDetails();
        honda.refuel();
    }
}
