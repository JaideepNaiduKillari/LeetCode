class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
        for(int i : arr){
            i = 0;  
        }
        for(int i : nums){
            arr[i] = 1;
        }  
        for(int i = 0;i<n+1;++i){
            if(arr[i] == 0){
                return i;
            }
        }
        return -1;
    }
}