//Create a class BankAccountSystem to pass values of account details.
public class BankAccountSystem {
    public static void main(String[] args) {
    //Create three class objects to pass account values.
    BankAccountDetails bank1 = new BankAccountDetails("Kanchan", "123456789");
    BankAccountDetails bank2 = new BankAccountDetails("Snehal", "987654321");
    BankAccountDetails bank3 = new BankAccountDetails("kaavy", "2468013579");

    //Check the instance of parent class.
    if(bank1 instanceof BankAccountDetails && bank2 instanceof BankAccountDetails && bank3 instanceof BankAccountDetails){
        System.out.println("bank1, bank2 and bank3 are instances of BankAccountDetails");
    }
    else{
        System.out.println("bank1, bank2 and bank3 are instances of BankAccountDetails");
    }

    //Display the details.
    bank1.display();
    bank2.display();
    bank3.display();
    
    //Call getTotalAccount to get total number of account using class name.
    BankAccountDetails.getTotalAccount();
    }
}
