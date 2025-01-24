//Create a class BankAccount with the following attributes and methods:
class BankAccount{
    private String accountNumber;
    private int balance;

    //constructor
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Cereate a method displayDetails() to display the details of the account number and balance.
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}

//Create a class SavingsAccount that extends BankAccount with the following attributes and methods:
class SavingsAccount extends BankAccount{
    private int interestRate;

    //constructor
    public SavingsAccount(String accountNumber, int balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    //create a method displayDetails() to display the details of the account number, balance and interest rate.
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

//Create a class CheckingAccount that extends BankAccount with the following attributes and methods:
class CheckingAccount extends BankAccount{
    private int withdrawalLimit;

    //constructor
    public CheckingAccount(String accountNumber, int balance , int withdrawalLimit) {
        super(accountNumber, balance );
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    //create a method displayDetails() to display the details of the account number, balance and withdrawal limit.
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

//Create a class FixedDepositAccount that extends BankAccount with the following attributes and methods:
class FixedDepositAccount extends BankAccount{
    private int compoundRate;

    //constructor
    public FixedDepositAccount(String accountNumber, int balance, int compoundRate) {
        super(accountNumber, balance );
        this.compoundRate = compoundRate;
    }
    @Override
    //create a method displayDetails() to display the details of the account number, balance and compound rate.
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Compound Rate: " + compoundRate);
    }
}

//Create a class BankManagement with the main method
public class BankManagement {
    public static void main(String[] args) {
        //creating obj bankaccount
        BankAccount account1 = new BankAccount("6748745746", 2200);
        //displaying details of account1
        account1.displayDetails();

        //creating obj savingAccount
        SavingsAccount account2 = new SavingsAccount("54386563412", 5000, 5);
        //displaying details of account2
        account2.displayDetails();

        //create obj checking account
        CheckingAccount account3 = new CheckingAccount("745646351225", 6000, 500);
        //displaying details of account3
        account3.displayDetails();

        //creating obj fixedDeposit
        FixedDepositAccount account4 = new FixedDepositAccount("35456732354", 900, 12); 
        //displaying detials of account4 
        account4.displayDetails();
    }
}