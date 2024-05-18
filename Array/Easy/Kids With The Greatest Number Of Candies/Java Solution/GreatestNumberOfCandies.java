import java.util.*;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        Solution solution_class = new Solution();

        int n, i, extraCandies;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length of the array: ");
            n = scanner.nextInt();

            int[] candies = new int[n];
            for (i=0; i<n; i++) {
                System.out.print("Enter arr[" + "]: ");
                candies[i] = scanner.nextInt();
            }

            System.out.print("Enter extra candies: ");
            extraCandies = scanner.nextInt();
            scanner.close();

            List<Boolean> result = new ArrayList<>();
            result = solution_class.kidsWithCandies(candies, extraCandies);

            for (i=0; i<n; i++) {
                System.out.print(result.get(i) + " ");
            }
        }
    }
}


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int size = candies.length;
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int i=0; i<size; i++)
        {
            if (candies[i] > max)
                max = candies[i];
        }
        for (int i=0; i<size; i++)
        {
            if (candies[i] + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }

        return ans;
    }
}