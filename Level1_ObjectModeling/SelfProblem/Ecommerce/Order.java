//Importing the required classes
import java.util.ArrayList;
import java.util.List;

//create Order class to store the order details
public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    // Create a constructor for the Order class
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Create a getter for the order ID
    public int getOrderId() {
        return orderId;
    }

    // Create a getter for the customer
    public Customer getCustomer() {
        return customer;
    }

    // Create a getter for the products in the order
    public List<Product> getProducts() {
        return products;
    }
    
    //method for calculating the total 
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
