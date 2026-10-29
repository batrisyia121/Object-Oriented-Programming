
public class Customer {
    private final String name;
    private final String address;
    private SavingAccount account;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setAccount(SavingAccount account) {
        this.account = account;
    }

    public SavingAccount getAccount() {
        return account;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer name: " + name);
        System.out.println("Address: " + address);

        if (account != null) {
            account.displayAccountInfo();
        } else {
            System.out.println("No account assigned.");
        }
    }

    public void deposit(double amount) {
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Error: No account assigned.");
        }
    }

    public void withdraw(double amount) {
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Error: No account assigned.");
        }
    }
}
