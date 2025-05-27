class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int zcount = 0;
        int prod = 1;
        for(int i : nums){
            if(i == 0){
                zcount++;
            }else{
                prod = prod *i;
            }
        }
        for(int i = 0 ; i < nums.length; ++i){
            if(zcount == 1){
                if(nums[i] == 0){ans[i]= prod;}else{ans[i] = 0;}
            }else if(zcount >1){
                ans[i] = 0;
            }else{
                ans[i] = prod/nums[i];
            }
        }
        return ans;
    }
}