public class Count_even_odd {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6 ,7 ,8,9};
        int even = 0, odd = 0;

        for (int num : numbers) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
