import java.util.Scanner;

public class nfibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");

        int n = sc.nextInt();

        int a=0 , b=1;

        for (int i=0 ; i<n ; i++){
            if (i== 0){
                System.out.println(a);
            }else if(i==1){
                System.out.println(b);
            }else{
                int next = a+b;
                System.out.println(next);
                a=b;
                b= next;
                
            }
        }
    }
}
