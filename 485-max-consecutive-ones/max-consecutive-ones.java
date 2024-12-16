class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m =-1;
        int j = -1;
        int i=0;
        for(;i<nums.length;++i){
            if(nums[i] == 0){
                m = Math.max(m,i-j-1);
                j=i;
            }
        }
        m = Math.max(m,i-j-1);
        return m;
    }

}