public class Max_min_array {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 67, 34, 89, 23};

        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

