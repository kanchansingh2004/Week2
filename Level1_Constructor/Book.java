//Create class book for book details
public class Book{
    private String title;
    private String author;
    private int price;

    //Create getter setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //Create getter setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    //Create getter setter for price
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    //Create constructor for input data
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //Create a default constructor to display message.
    Book(){
        System.out.println("Please enter book name");
    }
    //Create a display method to show data..
    void display(){
        System.out.println("title:" + title);
        System.out.println("price:" + price);
        System.out.println("author:" + author);
    }
}
