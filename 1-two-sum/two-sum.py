class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a=len(nums)
        b=[]
        for i in range(0,a):
            for j in range(i+1,a):
                if nums[i]+nums[j]==target:
                    b.append(i)
                    b.append(j)
                    return(b)