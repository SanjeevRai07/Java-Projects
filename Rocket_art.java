public class Rocket_art {
    public static void main(String[] args) {
        int height = 5; // change this for bigger rocket

        // Rocket Nose
        for (int i = 1; i <= height; i++) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Rocket Body
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }

        // Rocket Flames
        for (int i = 1; i <= height / 2; i++) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            for (int fire = 1; fire <= (2 * i - 1); fire++) {
                System.out.print("^");
            }
            System.out.println();
        }
    }
}
