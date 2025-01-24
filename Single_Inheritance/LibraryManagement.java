//Create a class Book with two member variables title and publicationYear. Create another class Author which extends Book class and has two
class Book{
    protected String title;
    protected int publicationYear;
}

//Author class extends Book class
class Author extends Book{
    private String name;
    private String bio;

    //Constructor for Author class
    Author(String title, String name, int publicationYear, String bio){
        this.title = title;
        this.name = name;
        this.publicationYear = publicationYear;
        this.bio = bio;
    }

    //display method to display all the member variables
    public void display(){
        System.out.println("Title: "+ title);
        System.out.println("Author Name: "+ name);
        System.out.println("Publication year: "+ publicationYear);
        System.out.println(bio);
    }
}
public class LibraryManagement{
    public static void main(String[] args) {
        //Creating an object of Author class
        Author author = new Author("Harry Potter and the Chamber of Secrets", "J.K Rowling", 2002, "A house-elf warns Harry against returning to Hogwarts, but he decides to ignore it. When students and creatures at the school begin to get petrified, Harry finds himself surrounded in mystery.");
        //Calling display method
        author.display();
    }
}