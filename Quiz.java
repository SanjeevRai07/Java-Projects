import java.util.Scanner;

public class Quiz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Quiz Competition in Arka Jain University!");

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Welcome "   + name );
        System.out.print("Enter your Enrollment Number: ");
        int enrollment = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Do you want to start the quiz? (Y/N): ");
        char start = sc.nextLine().charAt(0);

        int count = 0;

        if (start == 'Y' || start == 'y') {

            // Question 1
            System.out.println("\nQuestion 1 - What is the capital of India?");
            System.out.println("1. Kolkata\n2. New Delhi\n3. Mumbai\n4. Jamshedpur");
            System.out.print("Enter your answer: ");
            int ans1 = sc.nextInt();
            if (ans1 == 2) {
                System.out.println("Correct Answer");
                count++;
            } else {
                System.out.println("Incorrect Answer");
            }
            sc.nextLine();
            System.out.print("Do you want to continue? (Y/N): ");
            char c1 = sc.nextLine().charAt(0);
            if (c1 == 'N' || c1 == 'n') {
                System.out.println("You exited the quiz. Your score: " + count);
                return;
            }

            // Question 2
            System.out.println("\nQuestion 2 - Who is the founder of Java?");
            System.out.println("1. Sanjeev\n2. James Gosling\n3. Nargis Gunda\n4. Sumit");
            System.out.print("Enter your answer: ");
            int ans2 = sc.nextInt();
            if (ans2 == 2) {
                System.out.println("Correct Answer");
                count++;
            } else {
                System.out.println("Incorrect Answer");
            }
            sc.nextLine();
            System.out.print("Do you want to continue? (Y/N): ");
            char c2 = sc.nextLine().charAt(0);
            if (c2 == 'N' || c2 == 'n') {
                System.out.println("You exited the quiz. Your score: " + count);
                return;
            }

            // Question 3
            System.out.println("\nQuestion 3 - Who is the Prime Minister of India?");
            System.out.println("1. Rahul Gandhi\n2. Arvind Kejriwal\n3. Yogi Adityanath\n4. Narendra Modi");
            System.out.print("Enter your answer: ");
            int ans3 = sc.nextInt();
            if (ans3 == 4) {
                System.out.println("Correct Answer");
                count++;
            } else {
                System.out.println("Incorrect Answer");
            }
            sc.nextLine();
            System.out.print("Do you want to continue? (Y/N): ");
            char c3 = sc.nextLine().charAt(0);
            if (c3 == 'N' || c3 == 'n') {
                System.out.println("You exited the quiz. Your score: " + count);
                return;
            }

            // Question 4
            System.out.println("\nQuestion 4 - Who is the founder of Android?");
            System.out.println("1. Andy Rubin\n2. Sundar Pichai\n3. Steve Jobs\n4. Elon Musk");
            System.out.print("Enter your answer: ");
            int ans4 = sc.nextInt();
            if (ans4 == 1) {
                System.out.println("Correct Answer");
                count++;
            } else {
                System.out.println("Incorrect Answer");
            }
            sc.nextLine();
            System.out.print("Do you want to continue? (Y/N): ");
            char c4 = sc.nextLine().charAt(0);
            if (c4 == 'N' || c4 == 'n') {
                System.out.println("You exited the quiz. Your score: " + count);
                return;
            }

            // Question 5
            System.out.println("\nQuestion 5 - Who is the founder of Python?");
            System.out.println("1. Mark Zuckerberg\n2. James Gosling\n3. Guido van Rossum\n4. Linus Torvalds");
            System.out.print("Enter your answer: ");
            int ans5 = sc.nextInt();
            if (ans5 == 3) {
                System.out.println("Correct Answer");
                count++;
            } else {
                System.out.println("Incorrect Answer");
            }

            // Final score
            System.out.println("\nQuiz Completed!");
            System.out.println(name + ", your total score is: " + count + "/5");

        } else {
            System.out.println("You chose not to start the quiz. Goodbye!");
        }

        sc.close();
    }
}
