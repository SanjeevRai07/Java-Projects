public class Sortarray {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        System.out.println("Original Array:");
        printArray(arr);

        // Bubble Sort Logic
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Helper method to print array
    public static void printArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
