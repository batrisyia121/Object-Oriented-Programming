
public class SavingAccount {
    private String accountId;
    private double balance;

    public SavingAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;

            System.out.printf("Deposit amount: RM%,.2f%n", amount);
            System.out.printf("Account balance: RM%,.2f%n", balance);
        } else {
            System.out.println("Error: Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
        } else if (balance >= amount) {
            balance -= amount;

            System.out.printf("Withdraw amount: RM%,.2f%n", amount);
            System.out.printf("Account balance: RM%,.2f%n", balance);
        } else {
            System.out.println("Error: Insufficient balance.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account ID: " + accountId);
        System.out.printf("Balance: RM%,.2f%n", balance);
    }
}
