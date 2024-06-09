class Solution:
    def isPalindrome(self, x: int) -> bool:
        # A negative number cannot be a palindrome
        if x < 0:
            return False
        
        # Single digit numbers are always palindromes
        if x >= 0 and x < 10:
            return True
        
        # Calculate the reverse of the number
        original = x
        reversed_num = 0
        
        while x > 0:
            reversed_num = reversed_num * 10 + x % 10
            x //= 10
        
        # Check if the original number is equal to its reverse
        return original == reversed_num
