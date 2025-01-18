//Create a class BankAccountManagement to pass details of a person bank account.
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create an object of the SavingAccount class
        BankAccount savingAccount = new SavingAccount(123456789, "Mon Cheri", 2000000.00);

        // Call the displayDetails method
        savingAccount.displayDetails();
    }
}
