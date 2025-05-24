/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answerhead = null;
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1 == null && list2 == null)return answerhead;
        
        if(list1.val < list2.val){
            answerhead = list1;
            list1 = list1.next;
        }else{
            answerhead = list2;
            list2 = list2.next;
        }
        ListNode root = answerhead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                answerhead.next = list1;
                list1 = list1.next;
                answerhead = answerhead.next;
            }
            else{
                answerhead.next = list2;
                list2 = list2.next;
                answerhead = answerhead.next;
            }
        }
        while(list1 != null){
            answerhead.next = list1;
            list1 = list1.next;
            answerhead = answerhead.next;
        }
        while(list2 != null){
            answerhead.next = list2;
            list2 = list2.next;
            answerhead = answerhead.next;   
        }
        return root;
    }
}