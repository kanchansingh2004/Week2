package Day6.Level1_Polymorphism.BankingSystem;

// Interface Loanable
public interface Loanable {
    // Method to apply for loan
    void applyForLoan(double amount);

    // Method to calculate loan eligibility
    double calculateLoanEligibility();
}
