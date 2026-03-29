package Task3_ATM;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        int correctPIN = 1234;
        int attempts = 3;
        int enteredPIN;

        //  PIN Authentication
        while (attempts > 0) {
            System.out.print("Enter ATM PIN: ");
            enteredPIN = sc.nextInt();

            if (enteredPIN == correctPIN) {
                System.out.println(" Access Granted\n");
                break;
            } else {
                attempts--;
                System.out.println(" Wrong PIN! Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println(" Too many wrong attempts. Exiting...");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    account.showHistory();
                    break;

                case 5:
                    System.out.println(" Thank you for using ATM!");
                    break;

                default:
                    System.out.println(" Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}