//Import the required packages
import java.util.ArrayList;

//Create Bank class
public class Bank{
    // Instance Variables
    private String bankName;
    private ArrayList<Customer> customers;

    // Constructor to initialize Bank details
    public Bank(String bankName){
        this.bankName = bankName;
        customers = new ArrayList<>();
    }
    
    // Instance method to Add customer
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    
    // Instance method to open Account Bank Details
    public void openAccount(Customer customer, String ACCOUNT_NUMBER, double initialBalance) {
        if (customer == null) {
            System.out.println("Invalid customer. Cannot open account.");
            return;
        }
        
        // Add account to the customer if the account is valid
        if (ACCOUNT_NUMBER == null || ACCOUNT_NUMBER.isEmpty()) {
            System.out.println("Invalid account number. Cannot open account.");
            return;
        }
        
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Cannot open account.");
            return;
        }
    }



    // Method to display all customers in the bank
    public void displayCustomers() {
        System.out.println("Bank: " + bankName);
        if (customers.isEmpty()) {
            System.out.println("No customers.");
        } 
        else {
            // Display all customers using a for-each loop
            for (Customer customer : customers) {
                System.out.println("Customer: " + customer.getName());
            }
        }
    }

}