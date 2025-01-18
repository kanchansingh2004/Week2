// Create a class ProductInventory to pass the following parameters to the Product class
public class ProductInventory {
    public static void main(String[] args) {
        //Create class objects for parameterized and default constructor
        Product product1 = new Product("Sofa", 50000);
        Product product2 = new Product("Cupboard", 20000);
        Product product3 = new Product("TV", 10000);

        //Call class methods using object.
        product1.displayDetails();
        product2.displayDetails();
        product3.displayDetails();

        //Call class method using class name
        Product.displayTotalProducts();
    }
}
