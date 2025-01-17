//Create class MobileDetails for Mobile details.
public class MobilePhoneDetails {
    public static void main(String args[]){
        //Create class objects
        Mobile Mobile1 = new Mobile("Redmi","note 10S", 30000 );
        Mobile Mobile2 = new Mobile("Redmi","10 pro max", 450000 );

        //Call class methods using object.
        Mobile1.display();
        Mobile2.display();

    }
}