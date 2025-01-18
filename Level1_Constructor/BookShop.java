// Create a class BookShop with the following attributes
public class BookShop{
    public String ISBN;
    protected String title;
    private String author;

    // Create a getter and setter for the author attribute
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // Create a method displayDetails that displays the details of the book
    public void displayDetails() {
        System.out.println("ISBN no.: " + ISBN);
        System.out.println("title: " + title);
        System.out.println("author: " + getAuthor());
    }
}

// Create a class EBook that extends BookShop
class EBook extends BookShop{
    // Create a constructor that takes in the following parameters
    EBook(String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        setAuthor(author);
    }
}
