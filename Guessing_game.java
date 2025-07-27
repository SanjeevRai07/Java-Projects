import java.util.Random;
import java.util.Scanner;

public class Guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1; // Number between 1 to 100
        int guess;
        int attempts = 0;
        boolean isCorrect = false;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                isCorrect = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again. 🔽");
            } else {
                System.out.println("Too high! Try again. 🔼");
            }
        }

        sc.close();
    }
}
