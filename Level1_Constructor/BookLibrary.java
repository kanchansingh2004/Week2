public class BookLibrary {
    public static void main(String args[]){
        //Create class objects for parameterized
        BookRental book1 = new BookRental("Harry potter and the chamber of secret","Jk Rowling", 300,false );
        BookRental book2 = new BookRental("Harry potter and the deathly halloween","Jk Rowling", 450,false);

        //Call class methods using object.
        book1.display();
        book1.borrow();
        book2.display();
        book2.borrow();

    }
}
