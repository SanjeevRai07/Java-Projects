import java.util.Scanner;

public class Mtn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Display MTN Menu
        System.out.println("📱 Welcome to MTN Self Service");
        System.out.println("1. Check Balance");
        System.out.println("2. Buy Data");
        System.out.println("3. Recharge Airtime");
        System.out.println("4. Customer Care");
        System.out.println("5. Exit");
        System.out.print("👉 Enter your choice (1-5): ");
        
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("📞 Your balance is ₦1,500.00");
                break;
            case 2:
                System.out.println("💾 Select Data Bundle:");
                System.out.println("   a. 500MB for ₦100");
                System.out.println("   b. 1.5GB for ₦300");
                System.out.println("   c. 5GB for ₦1000");
                break;
            case 3:
                System.out.print("💳 Enter recharge PIN: ");
                String pin = sc.next();
                System.out.println("✅ Recharge successful! ₦" + pin.length() * 10 + " added.");
                break;
            case 4:
                System.out.println("☎️ Connecting to customer care... Please wait.");
                break;
            case 5:
                System.out.println("👋 Thank you for using MTN services!");
                break;
            default:
                System.out.println("❌ Invalid choice. Please enter a number between 1 and 5.");
        }

        sc.close();
    }
}

