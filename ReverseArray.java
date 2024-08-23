import java.util.*;


public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("enter the elements of array");
        for (int i=0 ; i<n ; i++){
            array[i] = sc.nextInt();
        }
        
        int start = 0 ;
        int end = n-1;

        while(start<end){
            int temp = array[start];
            array[start]= array[end];
            array[end]=temp;

            start ++;
            end --;
        }
        for (int i=0 ; i<n ; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
