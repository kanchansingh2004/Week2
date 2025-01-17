//Create class book for book details
public class Book{
    String title;
    String author;
    int price;
    //Create constructor for input data
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //Create a display method to show data..
    void display(){
        System.out.println("title:" + title);
        System.out.println("price:" + price);
        System.out.println("author:" + author);
    }
}
