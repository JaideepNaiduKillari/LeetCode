class Solution:
    def isPalindrome(self, x: int) -> bool:
        k = x
        if x<0:
            return False
        y=0
        while k>0:
            y=y*10+k%10
            k=k//10
        if x==y:
            return True
