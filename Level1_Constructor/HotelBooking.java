//Create HotelBooking class for take booking details.
public class HotelBooking {
    //Data members for guestName, roomType and nights.
    private String guestName;
    private String roomType; 
    private int nights;

    //Default constructor.
    HotelBooking(){
        System.out.println("Default Constructor called.");
        System.out.println("Please enter the booking details.");
    }

    //Parameterized Constructor.
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Copy constructor to copy one object to another.
    HotelBooking(HotelBooking p){
        this.guestName = p.guestName;
        this.roomType = p.roomType;
        this.nights = p.nights;
    }

    //MEthod to display the details
    void display(){
        System.out.println("Guest Name :" + guestName);
        System.out.println("Room type :" + roomType);
        System.out.println("Number of nights :" + nights);

    }
}
