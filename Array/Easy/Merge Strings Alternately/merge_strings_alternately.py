class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        ptr = 0
        result = ""
        while ptr < len(word1) or ptr < len(word2):
            if ptr<len(word1):
                result += word1[ptr]
            if ptr<len(word2):
                result += word2[ptr]
            ptr += 1
        
        return result     
    
solution_class = Solution()
word1 = input("Enter word 1: ")
word2 = input("Enter word 2: ")
result = solution_class.mergeAlternately(word1, word2)
print(result)