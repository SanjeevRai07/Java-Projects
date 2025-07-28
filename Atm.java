import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0; // Initial balance
        int choice;

        System.out.println("🏧 Welcome to Java ATM");

        while (true) {
            // Display ATM menu
            System.out.println("\n========= ATM Menu =========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("👉 Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Your current balance is: ₹" + balance);
                    break;

                case 2:
                    System.out.print("💵 Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("✅ ₹" + deposit + " deposited successfully.");
                    } else {
                        System.out.println("❌ Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("🏧 Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("✅ ₹" + withdraw + " withdrawn successfully.");
                    } else {
                        System.out.println("❌ Insufficient balance or invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("👋 Thank you for using Java ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid option. Please choose between 1 and 4.");
            }
        }
    }
}
