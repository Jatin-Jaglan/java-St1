import java.util.Scanner;

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows/columns:");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int diagonal1 = 0; // top left to bottom right
        int diagonal2 = 0; // top right to bottom left

 
        for (int i = 0; i < n; i++) {
            diagonal1 += matrix[i][i];
            System.out.print("n:"+ n + " ");
            System.out.print("i:"+i +" ");
            System.out.println( n-1-i );
            diagonal2 += matrix[i][n - 1 - i];
        }

        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 2: " + diagonal2);
    }
}
