//Create a class EcommercePlatform with a main method. Create a few products and customers. Place orders for the customers and display the order details.
public class EcommercePlatform {
    public static void main(String[] args) {
        // Create product class objects
        Product product1 = new Product("Laptop", 12000.00);
        Product product2 = new Product("Smartphone", 1800.00);
        Product product3 = new Product("Headphones", 1500.00);

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Customer 1 places an order
        Order order1 = customer1.placeOrder(1);
        order1.addProduct(product1);
        order1.addProduct(product3);

        // Customer 2 places an order
        Order order2 = customer2.placeOrder(2);
        order2.addProduct(product2);

        // Display order details for customer 1
        System.out.println("Order Details:");
        for (Order order : customer1.getOrders()) {
            System.out.println("Customer: " + order.getCustomer().getName());
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Products: " + order.getProducts());
            System.out.println("Total: $" + order.calculateTotal());
            System.out.println();
        }

        // Display order details for customer 2
        for (Order order : customer2.getOrders()) {
            System.out.println("Customer: " + order.getCustomer().getName());
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Products: " + order.getProducts());
            System.out.println("Total: $" + order.calculateTotal());
            System.out.println();
        }
    }
}
