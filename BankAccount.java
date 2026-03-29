package Task3_ATM;
import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<String> history;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.history = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid amount!");
            return;
        }

        balance += amount;
        history.add("Deposited: " + amount);
        System.out.println(" Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid amount!");
        } else if (amount > balance) {
            System.out.println(" Insufficient Balance!");
        } else {
            balance -= amount;
            history.add("Withdrawn: " + amount);
            System.out.println(" Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println(" Transaction History:");
            for (String h : history) {
                System.out.println(h);
            }
        }
    }
}