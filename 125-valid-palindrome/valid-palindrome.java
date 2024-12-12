class Solution {
    public boolean isPalindrome(String s) {
        String[] ch = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().split("");
        int left =0;int right = ch.length-1;
        for(String i : ch){
            System.out.print(i);
        }
        while(left<right){
            if(!ch[left].equals(ch[right])){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}