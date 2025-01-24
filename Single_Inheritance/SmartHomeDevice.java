//Create a class Device with two member variables deviceID and status. Create another class Thermostate which extends Device class and has an additional member variable temperatureSetting. Create a constructor for Thermostate class which initializes all the member variables. Create a method display() in Thermostate class which displays all the member variables. Create a main class SmartHomeDevice which creates an object of Thermostate class and calls the display() method.
class Device{
    protected String deviceID;
    protected String status;
}

//Thermostate class extends Device class
class Thermostate extends Device{
    private String temperatureSetting;

    //Constructor for Thermostate class
    Thermostate(String deviceID, String status, String temperatureSetting){
        this.deviceID = deviceID;
        this.status = status;
        this.temperatureSetting = temperatureSetting;
    }

    //display method to display all the member variables
    public void display(){
        System.out.println("Device ID: "+ deviceID);
        System.out.println("Status: "+ status);
        System.out.println("Temperature: "+ temperatureSetting);
    }
}
public class SmartHomeDevice {
    public static void main(String[] args) {
        //Creating an object of Thermostate class
        Thermostate thermostate = new Thermostate("A64", "ON", "20.4 Degree");
        //Calling display method
        thermostate.display();
    }
}
