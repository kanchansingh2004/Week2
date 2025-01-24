// Create a class Order with orderId and orderDate as attributes. Create a method getOrderStatus() to display the order details.
class Order {
    private int orderId;
    private String orderDate;

    // Constructor
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public void getOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Create a class ShippedOrder that extends Order with trackingNumber as an attribute. Create a method getOrderStatus() to display the order details.
class ShippedOrder extends Order {
    private int trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overridden method for status
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Order Status: Shipped");
    }
}

// Create a class DeliveredOrder that extends ShippedOrder with deliveryDate as an attribute. Create a method getOrderStatus() to display the order details.
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overridden method to display order status
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Order Status: Delivered");
    }
}

public class OnlineRetail {
    public static void main(String[] args) {
        // Create an object of Order class
        Order order = new Order(1, "2024-01-20");
        order.getOrderStatus();

        // Create an object of ShippedOrder class
        ShippedOrder shippedOrder = new ShippedOrder(2, "2023-11-02", 7777);
        shippedOrder.getOrderStatus();

        // Create an object of DeliveredOrder class
        DeliveredOrder deliveredOrder = new DeliveredOrder(3, "2022-05-03", 878787, "2022-05-15");
        deliveredOrder.getOrderStatus();
    }
}