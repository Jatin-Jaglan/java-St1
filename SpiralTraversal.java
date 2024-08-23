import java.util.Scanner;

public class SpiralTraversal {

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

        // Spiral traversal logic
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        System.out.println("Spiral Traversal of the matrix:");

        while (top<=bottom && left<= right) {
            for (int i=top ; i<=bottom; i++){
                System.out.print(matrix[i][left]);
            }
            left++;
            for (int i= left ; i<=right ;i++){
                System.err.print(matrix[bottom][i]);
            }
            bottom--;
            if(left<= right){
                for(int i=bottom ; i>= top ; i--){
                    System.out.print(matrix[i][right]);
                }
                right--;
            }
            if(top<= bottom){
                for(int i=right ; i>=left;i--){
                    System.out.print(matrix[top][i]);
                }
                top++;
            }
            
        }
        





        
        // while (top <= bottom && left <= right) {
        //     // Traverse from left to right along the top row
        //     for (int i = left; i <= right; i++) {
        //         System.out.print(matrix[top][i] + " ");
        //     }
        //     top++;

        //     // Traverse from top to bottom along the right column
        //     for (int i = top; i <= bottom; i++) {
        //         System.out.print(matrix[i][right] + " ");
        //     }
        //     right--;

        //     // Traverse from right to left along the bottom row, if still within bounds
        //     if (top <= bottom) {
        //         for (int i = right; i >= left; i--) {
        //             System.out.print(matrix[bottom][i] + " ");
        //         }
        //         bottom--;
        //     }

        //     // Traverse from bottom to top along the left column, if still within bounds
        //     if (left <= right) {
        //         for (int i = bottom; i >= top; i--) {
        //             System.out.print(matrix[i][left] + " ");
        //         }
        //         left++;
        //     }
        // }
    }
}
