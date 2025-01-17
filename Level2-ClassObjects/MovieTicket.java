public class MovieTicket {
    String movieName;
    String seatNumber;
    int price;

    //Create constructor for input data
    MovieTicket(String movieName,String seatNumber,int price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    //Create a display method to show data..
    void display(){
        System.out.println("movieName:" + movieName);
        System.out.println("seatNumber:" + seatNumber);
        System.out.println("price:" + price);
    }
}
