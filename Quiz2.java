import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String answer;

        System.out.println("🎮 Welcome to the Coding Quiz Game!");
        System.out.println("Answer the following questions:\n");

        // Question 1
        System.out.println("1. What is the size of int in Java?");
        System.out.println("a) 2 bytes\nb) 4 bytes\nc) 8 bytes\nd) Depends on system");
        System.out.print("Your answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("b")) {
            score++;
            System.out.println("✅ Correct!\n");
        } else {
            System.out.println("❌ Wrong! Correct answer: b) 4 bytes\n");
        }

        // Question 2
        System.out.println("2. What is the keyword to inherit a class in Java?");
        System.out.println("a) extends\nb) inherit\nc) implements\nd) this");
        System.out.print("Your answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("a")) {
            score++;
            System.out.println("✅ Correct!\n");
        } else {
            System.out.println("❌ Wrong! Correct answer: a) extends\n");
        }

        // Question 3
        System.out.println("3. Which method is the entry point of a Java program?");
        System.out.println("a) start()\nb) init()\nc) main()\nd) run()");
        System.out.print("Your answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("c")) {
            score++;
            System.out.println("✅ Correct!\n");
        } else {
            System.out.println("❌ Wrong! Correct answer: c) main()\n");
        }

        // Final score
        System.out.println("🏁 Quiz Over! Your total score is: " + score + "/3");

        if (score == 3) {
            System.out.println("🌟 Excellent! You're a Java champ!");
        } else if (score == 2) {
            System.out.println("👍 Good job! Keep practicing.");
        } else {
            System.out.println("📘 Keep learning and try again!");
        }

        sc.close();
    }
}
