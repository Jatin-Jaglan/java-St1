import java.util.Scanner;
public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int digits=0;
        int temp=n;
        while(temp>0){
            digits=digits+1;
            temp=temp/10;
        }
        int p=(int)Math.pow(10,digits);
        int fp=sq/p;
        int lp=sq%p;
        if((fp+lp) == n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}