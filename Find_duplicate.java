public class Find_duplicate{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 4, 7, 2, 9};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
