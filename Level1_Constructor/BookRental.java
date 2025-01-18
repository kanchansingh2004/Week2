//Create a class BookRental with the following attributes:
public class BookRental {
    String bookName;
    String author;
    int price;
    boolean isAvailable;

    //Create a constructor with the following parameters:
    public BookRental(String bookName, String author, int price, boolean isAvailable){
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    //Create method borrow to check the availability of the book to false.
    public void borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book is borrowed");
        }else{
            System.out.println("Book is not available");
        }
    }

    //Create a method display() to display the book details.
    public void display(){
        System.out.println("Book Name: "+bookName);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Is Available: "+isAvailable);
    }

}
