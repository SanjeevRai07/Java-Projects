public class Diagonal_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print("  ");
            }
            System.out.println(arr[i]);
        }
    }
}
