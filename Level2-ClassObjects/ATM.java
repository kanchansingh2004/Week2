public class ATM {

    // Main method to test the BankAccount class
    public static void main(String[] args) { 
	
        // Creating a new BankAccount object 
        BankAccount account = new BankAccount("Kelvin", "42478069", 1000);

        // Performing operations on the account
        account.displayBalance();
        account.deposit(500);
        account.withdraw(300); 
		
        account.withdraw(1500); // Example of insufficient balance
        account.displayBalance();
    }
}
