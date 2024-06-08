class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a={}
        for i,num in enumerate(nums):
            comp = target - num
            if comp in a:
                return(a[comp],i)
            a[num]=i