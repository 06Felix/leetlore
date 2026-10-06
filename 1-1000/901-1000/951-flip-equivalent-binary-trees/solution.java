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
    public boolean flipEquiv(TreeNode p, TreeNode q) {
        if(p == null || q == null)
            return p == q;
        if(p.val != q.val)
            return false;
        return (flipEquiv(p.left, q.right) && flipEquiv(p.right, q.left)) || 
               (flipEquiv(p.left, q.left) && flipEquiv(p.right, q.right));
    }
}
