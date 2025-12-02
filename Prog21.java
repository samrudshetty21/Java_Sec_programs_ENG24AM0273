class BankAccount {
    String accountHolder;
    String accountType;
    double balance;

    BankAccount() {
        this("Unknown", "Savings", 0.0);
        System.out.println("Default constructor called");
    }

    BankAccount(String accountHolder, String accountType) {
        this(accountHolder, accountType, 1000.0);
        System.out.println("Two-argument constructor called");
    }

    BankAccount(String accountHolder, String accountType, double balance) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
        System.out.println("Three-argument constructor called");
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: ₹" + balance);
        System.out.println("-------------------------");
    }
}

public class BankExample {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.displayDetails();

        BankAccount acc2 = new BankAccount("Amit Sharma", "Current");
        acc2.displayDetails();

        BankAccount acc3 = new BankAccount("Neha Verma", "Savings", 50000.0);
        acc3.displayDetails();
    }
}
