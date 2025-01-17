// Class to represent an item in the shopping cart
class CartItem {
    String itemName;  // Name of the item
    double price;     // Price of the item
    int quantity;     // Quantity of the item

    // Constructor to initialize the CartItem object
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the total cost of this item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display the details of the item
    public void displayItem() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity + ", Total: " + getTotalCost());
    }
}