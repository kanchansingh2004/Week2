//Importing List and ArrayList from java.util to use them in the class
import java.util.ArrayList;
import java.util.List;

//create Customer class
public class Customer {
    private String name;
    private List<Order> orders;

    // Create a constructor for the Customer class
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order for a customer
    public Order placeOrder(int orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        return order;
    }

    // Create a getter for the name of the customer
    public String getName() {
        return name;
    }
    // returing list of orders
    public List<Order> getOrders() {
        return orders;
    }

    public void displayaccounts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayaccounts'");
    }

    public void addAccount(Account account) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
    }

    public void displayAccounts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayAccounts'");
    }
}
