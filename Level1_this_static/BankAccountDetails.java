//Create a class BankAccountDetails to pass values of a person
public class BankAccountDetails {
    //Create data members to store details.
    private static String bankName = "Bank Of Baroda";
    private String accountHolder;
    private final String accountNumber;

    //Variable to calculate total account.
    static int totalAccounts = 0;

    //Constructor to initialize values using this keyword
    BankAccountDetails(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        totalAccounts++;

    }

    //Count the total account.
    static void getTotalAccount(){
        System.out.println("Total Number of account are : "+totalAccounts);
    }

    //Display the details.
    void display(){
        System.out.println("Bank Name : "+ bankName);
        System.out.println("Account Holder Name : "+ accountHolder);
        System.out.println("Account Number : "+ accountNumber);
    }
}
