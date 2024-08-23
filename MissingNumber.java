import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements (n - 1) because one number is missing
        System.out.println("Enter the number of elements provided (n - 1):");
        int count = sc.nextInt();

        // Input the elements
        int[] numbers = new int[count];
        System.out.println("Enter the elements:");
        int actualSum = 0;
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
            actualSum += numbers[i];
        }

        // Total number of elements should be n, where n = count + 1
        int n = count + 1;

        // Calculate the expected sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Find the missing number
        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);
    }
}




// Example:
// For a sequence where n = 5 and the numbers provided are 1, 2, 4, 5, the missing number is 3.

// Expected Sum for n = 5 is 5×(5+1)/2=15

// Actual Sum of the provided numbers 1 + 2 + 4 + 5 = 12.

// Missing Number: 15 - 12 = 3.
