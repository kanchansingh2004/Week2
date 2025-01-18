//Create class BookDetails for book details.
public class BookDetails{
    public static void main(String args[]){
        //Create class objects for parameterized and default constructor
        Book book = new Book();
        Book book1 = new Book("Harry potter and the chamber of secret","Jk Rowling", 300 );
        Book book2 = new Book("Harry potter and the deathly halloween","Jk Rowling", 450 );

        //Call class methods using object.
        book1.display();
        book2.display();

    }
}
