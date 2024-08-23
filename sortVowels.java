import java.util.*;

public class sortVowels {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        String vowels = "aeiouAEIOU";

        String vowelstr = "";
        String consonantsstr = "";

        // Separate vowels and consonants
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelstr += ch;
            } else {
                consonantsstr += ch;
            }
        }

        // Convert the vowel string to a character array and sort it
        char[] vowelArray = vowelstr.toCharArray();
        Arrays.sort(vowelArray);
        String sortedVowels = new String(vowelArray);

        // Concatenate sorted vowels and consonants
        String result = sortedVowels + consonantsstr;

        System.out.println("Sorted string with vowels at the start:");
        System.out.println(result);
    }
}
