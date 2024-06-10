class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res="";a = min(len(s) for s in strs)
        for i in range(a):
            current_char = strs[0][i]
            if all(s[i] == current_char for s in strs):
                res += current_char
            else:
                break        
        return res