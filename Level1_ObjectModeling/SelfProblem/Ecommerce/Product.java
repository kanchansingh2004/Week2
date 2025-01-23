//Create a class Product with the following private attributes:
public class Product {
    // Private attributes
    private String productName;
    private double price;

    // Create a constructor for the Product class
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Create a getter for the product name
    public String getProductName() {
        return productName;
    }

    // Create a getter for the price
    public double getPrice() {
        return price;
    }

    // Create a toString method to display the product name and price in the required format
    @Override
    public String toString() {
        return productName + " ($" + price + ")";
    }
}
