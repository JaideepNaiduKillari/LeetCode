class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a=len(nums)
        b=[0,0]
        for i in range(0,a):
            for j in range(i+1,a):
                if nums[i]+nums[j]==target:
                    b[0]=i
                    b[1]=j
                    return(b)