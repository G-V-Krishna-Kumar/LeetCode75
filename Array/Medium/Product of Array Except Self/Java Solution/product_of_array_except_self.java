import java.util.Scanner;

public class product_of_array_except_self {
    public static void main(String[] args) {
        Solution solution_class = new Solution();
        try (Scanner scanner = new Scanner(System.in)) {
            int n, i;
            System.out.print("Enter length of array nums: ");
            n = scanner.nextInt();

            int[] nums = new int[n];
            int[] answer = new int[n];
            for (i=0; i<n; i++) {
                System.out.print("Enter element nums[" + i + "]: ");
                nums[i] = scanner.nextInt();
            }

            
            answer = solution_class.prodExceptSelf(nums);
            for (i=0; i<n; i++) {
                System.out.print(answer[i] + " ");
            }
        }
    }
}

class Solution {
    public int[] prodExceptSelf (int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int prefix = 1, i;
        for (i=0; i<n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int postfix=1;
        for (i=n-1; i>=0; i--) {
            answer[i] *= postfix;
            postfix *= nums[i];
        }

        return answer;
    }
}