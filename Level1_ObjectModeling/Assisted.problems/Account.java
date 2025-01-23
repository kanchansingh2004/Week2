public class Account {
    //Data Members of class
    private double balance;
    private final String ACCOUNT_NUMBER;

    //Create method to get the account number.
    public String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    // Constructor to initialize Account details of a person
    public Account(String ACCOUNT_NUMBER, double initalBalance){
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.balance = initalBalance;
    }

    //Method to store the deposited balance
    public void deposit(double balance){
        if(balance > 0){
            System.out.println("Enter valid balance");
        }else{
            this.balance = this.balance + balance;
        }
    }

    //Method to withdraw balance
    public void withdraw(double balance){
        if(balance > 0){
            System.out.println("Enter valid balance");
        }else if(this.balance >= balance){
            this.balance = this.balance - balance;
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    
    //Method to display Account balance
    public void viewBalance(){
        System.out.println("Total Balance : "+this.balance);
    }


    //Method to display Account details
    public void displayAccountDetails(){
        System.out.println("\nAccount Details\n");
        System.out.println("Account Number : "+this.ACCOUNT_NUMBER);
        System.out.println("Balance : "+this.balance);
    }

}
