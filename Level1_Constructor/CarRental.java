public class CarRental {
    public static void main(String[] args) {
        //Create class objects for parameterized and default constructor
        CarRentalSystem car1 = new CarRentalSystem("Kannur", "Toyota", 5);
        CarRentalSystem car2 = new CarRentalSystem("Kuchu", "Honda", 8);

        //Call class methods using object.
        car1.display();
        car2.display();
    }
}
