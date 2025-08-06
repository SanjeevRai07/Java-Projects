import java.util.Scanner;

public class Number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = Integer.compare(num, 0);  // returns -1, 0, or 1

        switch (result) {
            case 1:
                System.out.println("Number is Positive");
                break;
            case -1:
                System.out.println("Number is Negative");
                break;
            case 0:
                System.out.println("Number is Zero");
                break;
        }

        sc.close();
    }
}
