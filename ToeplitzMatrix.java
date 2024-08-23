import java.util.*;

public class ToeplitzMatrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("enter the num of rows");
        int rows = sc.nextInt();
        System.out.println("enter the num of cols");
        int cols = sc.nextInt();

        int [][] matrix = new int [rows][cols];


        System.out.println("enter the elements of the matrix");

        for (int i=0 ; i<rows ; i++){
            for (int j=0 ;j<cols ; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int flag =1 ; 

            for (int i=1; i<rows ; i++){
                for (int j=1 ; j<cols ; j++){
                    if (matrix[i][j] != matrix[i-1][j-1]){
                        flag =0;
                        break;
                    }
                    else{
                        flag =1 ;
                   
                    }
                }
            }

            if(flag==1){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }


        // System.out.println("printing the matrix");
        // for (int i=0 ; i<rows ; i++){
        //     for(int j=0 ; j<cols ; j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
