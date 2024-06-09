class Solution:
    def isPalindrome(self, x: int) -> bool:
        x=str(x)
        y=len(x)
        for i in range(0,y//2):
            if x[i] != x[y-i-1]:
                return False  
        return True

