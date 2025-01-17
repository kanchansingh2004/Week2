public class Item {
    String itemName;
    String itemCode;
    int price;
    int quantity;
    //Create constructor for input data
    Item(String itemName, String itemCode, int price, int quantity){
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
        this.quantity = quantity;
    }
    //Create a display method to show data.
    void display(){
        System.out.println("itemName:" + itemName);
        System.out.println("itemCode:" + itemCode);
        System.out.println("price:" + price);
        System.out.println("quantity:" + quantity);
    }

    void totalCost(){
        System.out.println("The total cost is :"+ price*quantity);
    }
}
