// Create a class CarRentalSystem with the following private data members
public class CarRentalSystem {
    //Create private data members customerName, carModel, and rentalDays
    private String customerName;
    private String carModel;
    private int rentalDays;

    //Create a constructor that initializes the customerName, carModel, and rentalDays
    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    //Create a method that calculates the total rental cost
    public double calculateRentalCost() {
        double totalCost = 0;
        if (carModel.equals("Toyota")) {
            totalCost = 5000 * rentalDays;
        } else if (carModel.equals("Honda")) {
            totalCost = 10000 * rentalDays;
        } else if (carModel.equals("BMW")) {
            totalCost = 9000 * rentalDays;
        }

        //return the total cost
        return totalCost;
    }

    //Create a method that displays the results
    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateRentalCost());
    }
}

    
