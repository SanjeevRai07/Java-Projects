import java.util.Scanner;

public class Shape_idenfier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides (3 to 8): ");
        int sides = sc.nextInt();

        switch (sides) {
            case 3:
                System.out.println("Triangle");
                break;
            case 4:
                System.out.println("Quadrilateral");
                break;
            case 5:
                System.out.println("Pentagon");
                break;
            case 6:
                System.out.println("Hexagon");
                break;
            case 7:
                System.out.println("Heptagon");
                break;
            case 8:
                System.out.println("Octagon");
                break;
            default:
                System.out.println("Shape not supported");
        }

        sc.close();
    }
}
