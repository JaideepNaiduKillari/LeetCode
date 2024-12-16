class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int x = (nums.length - k);
        int[] arr = new int[x];
        for(int i =0;i<x;++i){
            arr[i]=nums[i];
        }
        for(int i = 0;i<k;++i){
            nums[i] = nums[x+i];
        }
        for(int i =k;i<nums.length;++i){
            nums[i] = arr[i-k];
        }    
    }
}