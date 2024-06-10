class Solution:
    def romanToInt(self, s: str) -> int:
        roman_to_int = {
            'I': 1, 'V': 5, 'X': 10, 'L': 50,
            'C': 100, 'D': 500, 'M': 1000
        }
        res = 0
        b=len(s)
        for i in range(b):
            if i < b - 1 and roman_to_int[s[i]] < roman_to_int[s[i + 1]]:
                a=roman_to_int[s[i]]
                res-=a
            else:
                a=roman_to_int[s[i]]
                res+=a
        return res