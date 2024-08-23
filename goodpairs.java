import java.util.*;

public class goodpairs {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        
        System.out.println("enter the no of elements ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0 ; i<n ; i++){
            array[i]= sc.nextInt();
        }
        int count =0 ;
        for (int i=0 ; i<n ; i++){
            for (int j=i+1 ; j<n ; j++){
                if(array[i]== array[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
   } 
}
