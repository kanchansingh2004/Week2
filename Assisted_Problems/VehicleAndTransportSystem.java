//Create a class Vehicle. The class will have two protected variables maxSpeed and fuelType.
class Vehicle{
    //Create two protected variables maxSpeed and fuelType.
    protected float maxSpeed;
    protected String fuelType;

    //Create a method displayInfo which will print the maxSpeed and fuelType.
    public void displayInfo(){
        System.out.println("Max Speed: "+ maxSpeed + "km/h" + "\nFuel Type:" + fuelType);
    }
}

//Create a class MotorCycle which will inherit the Vehicle class.
class MotorCycle extends Vehicle{
    //Create a constructor which will take maxSpeed and fuelType as parameters.
    MotorCycle(float maxSpeed, String fuelType){
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }
}

//Create a class Car which will inherit the Vehicle class.
class Car extends Vehicle{
    private int seatCapacity;

    //Create a constructor which will take maxSpeed, fuelType and seatCapacity as parameters.
    Car(float maxSpeed, String fuelType, int seatCapacity){
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.seatCapacity = seatCapacity;
    }

    //Create a method displaySeatCapacity which will print the seatCapacity.
    public void displaySeatCapacity(){
        System.out.println("Seat Capacity: "+ seatCapacity);
    }
}

//Create a class Truck which will inherit the Vehicle class.
class Truck extends Vehicle{
    Truck(float maxSpeed, String fuelType){
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }
}

//Create a class VehicleAndTransportSystem.
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        //Create an object of Car class and call the displayInfo and displaySeatCapacity method.
        Car car = new Car(200, "Petrol", 8);
        car.displayInfo();
        car.displaySeatCapacity();

        //Create an object of MotorCycle class and call the displayInfo method.
        MotorCycle motorCycle = new MotorCycle(180, "Petrol");
        motorCycle.displayInfo();

        //Create an object of Truck class and call the displayInfo method.
        Truck truck = new Truck(60, "Diesel");
        truck.displayInfo();
    }
}
