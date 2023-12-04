import java.util.Scanner;

public class BankAccount {
    private static final String PIN = "1234";
    private static double accountBalance = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.println("Please enter your PIN:");

        String enteredPIN = scanner.nextLine();

        if (validatePIN(enteredPIN)) {
            showOptions(scanner);
        } else {
            System.out.println("Invalid PIN. Exiting...");
        }

        scanner.close();
    }

    private static boolean validatePIN(String enteredPIN) {
        return enteredPIN.equals(PIN);
    }

    private static void showOptions(Scanner scanner) {
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your account balance is: $" + accountBalance);
    }

    private static void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + accountBalance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    private static void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit successful. New balance: $" + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
