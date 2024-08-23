import java.util.*;

public class firstNPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number");
        int n = sc.nextInt();

        int count =0;
        int num = 2;

        while(count<n){
            boolean isPrime = true;

            if (num>1){
                if (num==2){
                    isPrime = true;

                }else if(num %2 ==0){
                    isPrime = false;
                }else{
                    for(int i=3 ; i*i<=num ; i+=2){
                        if(num % i ==0){
                            isPrime = false;
                            break;
                        }
                    }
                }
            }else{
                isPrime = false;
            }
            if (isPrime){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
