//Create a class LibraryManagementSystem to pass values of book
public class LibraryManagementSystem {
    public static void main(String[] args) {
        //Create class objects.
        Book book1 = new Book("Harry potter and the order of phoneix", "JK Rowling", 101);

        //Check the instance of parent class.
        if(book1 instanceof Book){
            System.out.println("book1 is an instance of BankAccountDetails");
        }
        else{
            System.out.println("book1 is not an instance of BankAccountDetails");
        }

        //Display the details.
        book1.display();

        //Display the library name using class name.
        Book.displayLibraryName();
    }
}
