import java.util.Scanner;

public class Money_counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define denominations (Indian currency)
        int[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.print("💰 Enter amount to count: ₹");
        int amount = sc.nextInt();

        System.out.println("\n🧾 Currency breakdown for ₹" + amount + ":");

        for (int note : denominations) {
            int count = amount / note;
            if (count != 0) {
                System.out.println("₹" + note + " x " + count + " = ₹" + (note * count));
                amount = amount % note;
            }
        }

        sc.close();
    }
}
