class Solution:
    def isPalindrome(self, x: int) -> bool:
        k = x
        if x<0:
            return False
        y=0
        while x>0:
            y=y*10+x%10
            x=x//10
        print(y)
        if k==y:
            return True
