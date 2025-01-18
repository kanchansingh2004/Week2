public class HotelBookingManagement {
    public static void main(String[] args) {
        //Pass value and call method .
        HotelBooking person1 = new HotelBooking("Kanchan Singh","Delux",7);
        HotelBooking person2 = new HotelBooking("Jeon Jungkook","Premium",4);
        //Passing object (Person1) in object person3
        HotelBooking person3 = new HotelBooking(person1);
        HotelBooking person4 = new HotelBooking();
        

        //Method call to display the results.
        person1.display();
        person2.display();
        person3.display();
    }
}
