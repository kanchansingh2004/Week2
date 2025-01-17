//Create class Mobile for Mobile details
public class Mobile {
    String brand;
    String model;
    int price;
    //Create constructor for input data
    Mobile(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    //Create a display method to show data..
    void display(){
        System.out.println("brand:" + brand);
        System.out.println("model:" + model);
        System.out.println("price:" + price);
    }
}
