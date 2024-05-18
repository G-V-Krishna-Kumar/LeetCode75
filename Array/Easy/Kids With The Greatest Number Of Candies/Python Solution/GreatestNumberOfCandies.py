class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        ans = []
        maximum = max(candies)
        for i in candies:
            if i + extraCandies >= maximum:
                ans.append(True)
            else:
                ans.append(False)
        
        return ans


solution_class = Solution()

candies = eval(input("Enter candies array: "))
extraCandies = int(input("Enter extra candies: "))

ans = solution_class.kidsWithCandies(candies, extraCandies)
print(ans)