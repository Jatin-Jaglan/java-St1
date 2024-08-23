/// both code works 





// import java.util.*;

// public class RotaeArray90deg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

    
//         System.out.println("Enter the number of rows:");
//         int rows = sc.nextInt();
//         System.out.println("Enter the number of columns:");
//         int cols = sc.nextInt();


//         int[][] matrix = new int[rows][cols];
//         System.out.println("Enter the elements of the matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }  
//         int[][] matrix2 = new int[rows][cols];

//         for (int j = 0; j < rows; j++) {
//             for (int i = 0; i < cols; i++) {
//                 matrix2[j][i]= matrix[i][j];
//             }
//         }

//         for (int i = 0; i <rows; i++) {
//             for (int j = cols-1; j >=0; j--) {
//                 System.out.print(matrix2[i][j]+ " ");
//             }
//             System.out.println();
//         }  
//     }
// }







import java.util.Scanner;
public class rotatematrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int[][] ans= new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
    }
    }
}