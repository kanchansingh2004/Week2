// Main class to simulate the shopping cart functionality

import java.util.Scanner;

public class ShoppingCart {

    // Array to store the cart items (fixed size for simplicity)
    static CartItem[] cart = new CartItem[10];
    static int itemCount = 0;  

    // Method to add an item to the cart
    public static void addItem(String itemName, double price, int quantity) {
        if (itemCount < cart.length) {
            cart[itemCount] = new CartItem(itemName, price, quantity);  
            itemCount++;  
            System.out.println("Item added to cart: " + itemName);
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // Method to remove an item from the cart by its name
    public static void removeItem(String itemName) {
        boolean itemFound = false;  

        // Iterate through the cart to find the item
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equalsIgnoreCase(itemName)) {
                // Shift the items to remove the current item
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[itemCount - 1] = null;  
                itemCount--;  
                itemFound = true;
                System.out.println("Item removed from cart: " + itemName);
                break;
            }
        }

        // If the item was not found in the cart
        if (!itemFound) {
            System.out.println("Item not found in the cart.");
        }
    }

    // Method to display the total cost of all items in the cart
    public static void displayTotalCost() {
        double totalCost = 0.0;

        // Iterate through the cart to calculate the total cost
        for (int i = 0; i < itemCount; i++) {
            totalCost += cart[i].getTotalCost();
        }

        System.out.println("Total Cost of Items in Cart: " + totalCost);
    }

    // Method to display all items in the cart
    public static void displayCart() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
        } else {
            // Display each item
            System.out.println("Items in the Cart:");
            for (int i = 0; i < itemCount; i++) {
                cart[i].displayItem();  
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            // Perform actions based on user choice
            switch (choice) {
                case 1:
                    // Add item to the cart
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    addItem(itemName, price, quantity);
                    break;
                case 2:
                    // Remove item from the cart
                    System.out.print("Enter the name of the item to remove: ");
                    String removeItemName = scanner.nextLine();
                    removeItem(removeItemName);
                    break;
                case 3:
                    // Display items in the cart
                    displayCart();
                    break;
                case 4:
                    // Display the total cost
                    displayTotalCost();
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting the program. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}