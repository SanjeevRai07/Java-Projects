public class Armstrong{

    // Method to check Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }

        return result == original;
    }

    public static void main(String[] args) {
        int number = 153;

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number ✅");
        } else {
            System.out.println(number + " is not an Armstrong number ❌");
        }
    }
}
