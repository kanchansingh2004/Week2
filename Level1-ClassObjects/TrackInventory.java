//Create class BookDetails for book details.
public class TrackInventory{
    public static void main(String args[]){
        //Create class objects
        Item Item1 = new Item("Tutti fruity ice cream","A9Z20",150,5);
        Item Item2 = new Item("Dairy Milk Silk","B1Z30",95,3);

        //Call class methods using object and pass quantity in total cost method to calculate total cost.
        Item1.display();
        Item1.totalCost();
        System.out.println();
        Item2.display();
        Item1.totalCost();


    }
}