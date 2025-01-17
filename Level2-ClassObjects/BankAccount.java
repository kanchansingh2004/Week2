// Creating the BankAccount class to store and manage bank account details 
public class BankAccount{
    // Defining attributes for account holder, account number, and balance
    String accountHolder; 
	String accountNumber;
	double balance;
	
	// Constructor to initialize the bank account attributes                      
	BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
		this.accountNumber = accountNumber; 
		this.balance = balance;
	}

    // Method to deposit money into the account 
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". Current balance: " + balance);
        } 
		else {
            System.out.println("----Invalid Amount-----");
        }
    }

    // Method to withdraw money from the account (only if sufficient balance exists) 
    void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) 
			{
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ". Current balance: " + balance);
            } 
			else {
                System.out.println("Insufficient balance. Current balance: " + balance);
            }
        } 
		else {
            System.out.println("----Invalid Amount-----");
        }
    }

    // Method to display the current balance 
    public void displayBalance(){
        System.out.println("Current balance: " + balance);
    }
}
