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
    private boolean check(TreeNode t,int n){
        if(t == null)
            return true;
        return t.val == n && check(t.left,n) && check(t.right,n);
    }
    public boolean isUnivalTree(TreeNode root) {
        return check(root.left,root.val) && check(root.right,root.val);
    }
}
