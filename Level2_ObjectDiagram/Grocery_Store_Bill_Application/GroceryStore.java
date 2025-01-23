//Create a class Customer for initializing a customer's details.
class Customer {
    String name;
    Product product1;
    Product product2;

    //Create constructor for customer
    public Customer(String name) {
        this.name = name;
    }
    // Method to add products
    public void addProducts(Product p1, Product p2) {
        this.product1 = p1;
        this.product2 = p2;
    }  
}
// Create a product class to store the product details. 
class Product {
    String name;
    double quantity;
    double pricePerUnit;
    
    //Create a constructor to initialize the values
    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    
    //Method to calculate the prices
    public double calculatePrice() {
        return quantity * pricePerUnit;
    }
}

// Create a class BillGenerator to calculate the total cost 
class BillGenerator {
    public double calculateTotal(Customer customer) {
        double total = 0;
        
        // Add price of first product if it exists
        if (customer.product1 != null) {
            total += customer.product1.calculatePrice();
        }    
        // Add price of second product if it exists
        if (customer.product2 != null) {
            total += customer.product2.calculatePrice();
        }
        return total;
    }
    
    //Create method to generate the receipt of customer
    public void generateReceipt(Customer customer) {
        System.out.println("Receipt for " + customer.name);
        
        if (customer.product1 != null) {
            System.out.println(customer.product1.name + ":" + 
            customer.product1.calculatePrice());
        }
        if (customer.product2 != null) {
            System.out.println(customer.product2.name + ":" + 
            customer.product2.calculatePrice());
        }
        System.out.println("Total: " + calculateTotal(customer));
    }
}

class GroceryStore {
    public static void main(String[] args) {
        // Create a customer object while passing the name.
        Customer customer = new Customer("Bunny");
        
        // Create product object to pass the item details.
        Product apples = new Product("Apples", 2, 3); // 20 kg at Rs30 per kg
        Product milk = new Product("Milk", 1, 2);    // 100 liters at Rs25 per liter
        
        // Call method to add products to customer list
        customer.addProducts(apples, milk);
        
        // Create bill generator and generate receipt
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateReceipt(customer);
    }
}