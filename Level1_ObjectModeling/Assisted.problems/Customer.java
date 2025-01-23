//Importing ArrayList class from java.util package
import java.util.ArrayList;

//Create Customer class
public class Customer {
    // Instance Variables
    private String name;
    private ArrayList<Account> accounts;

    //Create a getter method to get the name of the customer
    public String getName() {
        return name;
    }

    // Constructor to initialize Customer details
    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    // Method to add an account to the Customer
public void addAccount(Account account) {
    if (account != null) {
        accounts.add(account);
        System.out.println("Account added successfully for customer: " + name);
    } 
    else {
        System.out.println("Invalid account. Cannot add to customer: " + name);
    }
}

    // Method to display all accounts of the Customer
    public void displayAccounts() {
        System.out.println("Customer: " + name);
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } 
        else {
            // Display all accounts using a for-each loop
            for (Account Account : accounts) {
                Account.displayAccountDetails();
            }
        }
    }
}
