class Solution:
    def romanToInt(self, s: str) -> int:
        roman_to_int = {
            'I': 1, 'V': 5, 'X': 10, 'L': 50,
            'C': 100, 'D': 500, 'M': 1000
        }
        res = 0
        for i in range(len(s)):
            a=roman_to_int[s[i]]
            if i < len(s) - 1 and a < roman_to_int[s[i + 1]]:
                res -= a
            else:
                res+=a
        return res