import java.util.Scanner;

public class WavePrintMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        // Input matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Wave print of the matrix
        System.out.println("Wave print of the matrix:");
        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                // Traverse from top to bottom for even-indexed columns
                for (int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Traverse from bottom to top for odd-indexed columns
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
