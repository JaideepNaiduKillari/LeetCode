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

    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr =nxt;
        }
        return prev;
    }    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next  ==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = reverse(slow);
        ListNode temp1 = prev;
        ListNode temp2 = head;
        while(temp1 != null){
            if(temp1.val != temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
}