public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define matrix A (2x3)
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Define matrix B (3x2)
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Get dimensions of A and B
        int rowsA = A.length; // Number of rows in A
        int colsA = A[0].length; // Number of columns in A
        int rowsB = B.length; // Number of rows in B
        int colsB = B[0].length; // Number of columns in B

        // Initialize matrix C with dimensions (rowsA x colsB)
        int[][] C = new int[rowsA][colsB];

        // Check if matrix multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                C[i][j] = 0; // Initialize the element
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the result matrix C
        System.out.println("Result matrix C:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
