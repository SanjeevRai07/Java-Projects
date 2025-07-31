public class Recursion{
    public static void main(String[] args) {
        printFrom1To100(1);
    }

    // Recursive method to print numbers
    public static void printFrom1To100(int num) {
        if (num > 100) {
            return; // base case
        }

        System.out.println(num); // print current number
        printFrom1To100(num + 1); // recursive call with next number
    }
}
