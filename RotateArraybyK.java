import java.util.*;

public class RotateArraybyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of the element in the array"); 
        int n = sc.nextInt();

        int[] array = new int[n];

        System.err.println("enter the elements of an array");
        for (int i=0 ; i<n ; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("enter the no of rotations");
        int k  = sc.nextInt();

        k = k%n;
        reverseArray(array, 0, n-1);
        reverseArray(array, 0, k-1);
        reverseArray(array, k, n-1);

        for (int i=0 ; i<n ; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void reverseArray (int[] array ,  int start , int end){
        while(start<end){
            int temp = array[start];
            array[start]= array[end];
            array[end]= temp;
            start++;
            end--;
        }
    }
}
