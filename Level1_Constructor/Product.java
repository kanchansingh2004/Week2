// Create a class Product with the following private instance variables
public class Product {
    //Create instance variables productName and price
    private String productName;
    private double price;

    //Create a class variable totalProducts
    private static int totalProducts = 0;

    //Create a constructor that initializes the productName and price
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    //Create a method displayProductDetails() to display the details of a product
    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    //Create a class method displayTotalProducts() to show the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

}
