public class Matrix_multiplication {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        int[][] B = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] product = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix Multiplication:");
        for (int[] row : product) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
