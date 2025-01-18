// Create a class BankAccount that takes account details.
public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private  double balance;

    // Create a getter and setter for the balance attribute
    public double getbalance() {
        return balance;
    }
    public void setbalance(double balance) {
        this.balance = balance;
    }

    // Create a method displayDetails that displays the details of the book
    public void displayDetails() {
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("accountHolder: " + accountHolder);
        System.out.println("balance: " + getbalance());
    }
}

// Create a class SavingAccount that extends BankAccount
class SavingAccount extends BankAccount{
    // Create a constructor that takes in the following parameters
    SavingAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;;
        this.accountHolder = accountHolder;
        setbalance(balance);
    }
}
