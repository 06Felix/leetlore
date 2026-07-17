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
    private boolean eq(TreeNode a,TreeNode b){
        if(a == null && b == null)
            return true;
        if(a == null || b == null)
            return false;
        return a.val == b.val && eq(a.left,b.left) && eq(a.right,b.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
            return false;
        return eq(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
