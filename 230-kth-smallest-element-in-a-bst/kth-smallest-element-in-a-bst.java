/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void addtolist(ArrayList<Integer> l,TreeNode root){
        if(root == null){
            return;
        }
        l.add(root.val);
        addtolist(l,root.left);
        addtolist(l,root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        addtolist(l,root);
        Collections.sort(l);
        return l.get(k-1);
    }
}