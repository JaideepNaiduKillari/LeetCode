class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int x = (nums.length - k);
        int[] arr = new int[x];
        for(int i =0;i<x;++i){
            arr[i]=nums[i];
        }
        for(int i = 0;i<nums.length;++i){
            if(i<k){
                nums[i] = nums[x+i];
            }
            else{
                nums[i] = arr[i-k];
            }    
        }
    }
}