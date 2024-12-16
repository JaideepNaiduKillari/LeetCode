class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m =-1;
        int s =0;
        for(int i = 0;i<nums.length;++i){
            if(nums[i] == 1){
                s++;
            }
            if(nums[i] == 0 || i == nums.length-1){
                if(m<s){
                    m = s;
                }
                s=0;
            }
        }
        return m;
    }

}