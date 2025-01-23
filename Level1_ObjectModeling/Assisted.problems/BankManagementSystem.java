// Create a Bank Management System using the Object Modeling concepts. The system should have the following classes:
public class BankManagementSystem {
    public static void main(String[] args) {
        // Create some Bank objects
        Bank bank1 = new Bank("SBI Bank");
        Bank bank2 = new Bank("PUNB Bank");

        // Create some Customer objects
        Customer customer1 = new Customer("Prince Raj");
        Customer customer2 = new Customer("Dhani Prajapati");
        Customer customer3 = new Customer("Viraj Khushwaha");
        Customer customer4 = new Customer("Stuti Kumari");

        // Add Customers to Banks
        bank1.addCustomer(customer2);

        bank2.addCustomer(customer1);

        // Add Accounts to Customers
        customer1.addAccount(new Account("1111", 10300));
        customer2.addAccount(new Account("2111", 11000));
        customer3.addAccount(new Account("3111", 1000));
        customer4.addAccount(new Account("6111", 11000));

        // Open a new account for customer1 using the Bank class
        bank2.openAccount(customer1, "03333", 4000);

        // Display the Banks Details
        System.out.println("\nDisplaying Customers for Bank 1:");
        bank1.displayCustomers();

        System.out.println("\nDisplaying Customers for Bank 2:");
        bank2.displayCustomers();

        // Display all accounts for a customer
        System.out.println("\nDisplaying Accounts for Customer 1:");
        customer2.displayAccounts();
    }
}
