
public class Main {
    public static void main(String[] args) {

        // Create a savings account
        SavingAccount account = new SavingAccount("1358923", 1500.00);

        // Create a customer
        Customer customer = new Customer("Zainal", "Durian Tunggal");

        // Assign the account to the customer
        customer.setAccount(account);

        // Display customer information
        System.out.println("=== CUSTOMER INFORMATION ===");
        customer.displayCustomerInfo();

        // Deposit money
        System.out.println("\n=== DEPOSIT ===");
        customer.deposit(500.00);

        // Withdraw money
        System.out.println("\n=== WITHDRAW ===");
        customer.withdraw(100.00);

        // Display final account information
        System.out.println("\n=== FINAL ACCOUNT INFORMATION ===");
        account.displayAccountInfo();
    }
}
