public class Half_pyramid {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print(arr[j] + " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
