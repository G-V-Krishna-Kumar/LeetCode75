
import java.util.Scanner;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0, i, arr_length = flowerbed.length;
        boolean left, right;
        for(i=0; i<arr_length; i++) {
            if (flowerbed[i] == 0) {
            left = (i==0) || (flowerbed[i-1] == 0);
            right = (i == arr_length-1) || (flowerbed[i+1] == 0);
            if (left && right) {
                count++;
                flowerbed[i] = 1;
            }
            }
        }

        
        return count>=n;
    }
}

class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);
        int n, i, size;
        System.out.print("Enter size of array: ");
        size = scanner.nextInt();
        int[] flowerbed = new int[size];
        
        for (i=0; i<size; i++) {
            System.out.print("Enter arr [" + i + "]: ");
            flowerbed[i] = scanner.nextInt();
        }

        System.out.print("Enter value of n: ");
        n = scanner.nextInt();

        boolean result = solution.canPlaceFlowers(flowerbed, n);

        scanner.close();

        System.out.println(result);
    }
}