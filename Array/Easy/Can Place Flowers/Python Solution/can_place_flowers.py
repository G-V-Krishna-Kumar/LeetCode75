class Solution:
    def canPlaceFlowers(self, flowerbed, n):
        count = 0
        for i in range(len(flowerbed)):
            if flowerbed[i] == 0:
                left = (i == 0) or (flowerbed[i-1] == 0)
                right = (i == len(flowerbed)-1) or (flowerbed[i+1] == 0)
            
                if left and right:
                    flowerbed[i] = 1
                    count += 1
        
        return count >= n
        
solution_cass = Solution()

flowerbed = eval(input("Enter flowerbed array: "))
n = int(input("Enter value of n: "))
result = solution_cass.canPlaceFlowers(flowerbed, n)
print(result)