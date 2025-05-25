/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp = root;
        while((temp.val>p.val && temp.val>q.val) || (temp.val<p.val && temp.val<q.val)){
            if(temp.val>p.val && temp.val>q.val){
                temp = temp.left;
            }
            if(temp.val<p.val && temp.val<q.val){
                temp = temp.right;
            }
        }
        return temp;
    }
}