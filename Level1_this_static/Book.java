//Create a class Book to initialize a patient details.
public class Book {
    //Create data members to store details.
    static String libraryName = "Swami Vivekanand Library";
    private String title;
    private String author;
    final int isbn;

    //Constructor to initialize values using this keyword.
    Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //Create displayLibraryName to print library name.
    static void displayLibraryName(){
        System.out.println("The library name is : "+ libraryName);
    }

    //Display the details.
    void display(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + isbn);
    }
}
