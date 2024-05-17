import java.util.Scanner;

public class merge_strings_alternately {
    public static void main(String[] args) {
        Solution solution_class = new Solution();
        Scanner scanner = new Scanner(System.in);
        String word1, word2;
        
        System.out.print("Enter word1: ");
        word1 = scanner.next();

        System.out.print("Enter word2: ");
        word2 = scanner.next();

        scanner.close();

        String result = solution_class.mergeAlternately(word1, word2);
        System.out.println(result);

    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int ptr = 0;
        int len1 = word1.length();
        int len2 = word2.length();

        while (ptr < len1 || ptr < len2) {
            if (ptr < len1) {
                result.append(word1.charAt(ptr));
            }
            if (ptr < len2) {
                result.append(word2.charAt(ptr));
            }

            ptr++;
        }

        return result.toString();
    }
}