package Day6.Level1_Polymorphism.OnlineFoodDeliverySystem;

// Interface Discountable
public interface Discountable {
    //create a method applyDiscount
    double applyDiscount();

    //create a default method getDiscountDetails
    default void getDiscountDetails() {
        System.out.println("Discount applied as per the policy.");
    }
}
