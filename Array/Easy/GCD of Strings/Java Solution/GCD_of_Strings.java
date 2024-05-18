import java.util.*;

public class GCD_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;

        System.out.print("Enter String 1: ");
        str1 = scanner.nextLine();
    
        System.out.print("Enter String 2: ");
        str2 = scanner.nextLine();

        Solution solution = new Solution();
        String answer = solution.gcdOfStrings(str1, str2);
        System.out.println(answer);

        scanner.close();
    }
}

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //Assume str2 to be the smallest string

        //swap str1 and str2 if str2 is bigger than str1
        if (str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        }

        //base case
        if (str1.equals(str2)) {
            return str2;
        }

        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }

        return "";
    }
}