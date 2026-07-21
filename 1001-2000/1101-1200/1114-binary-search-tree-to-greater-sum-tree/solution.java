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
    private int addSum = 0;
    private void revIn(TreeNode t){
        if(t == null)
            return;
        revIn(t.right);
        t.val += addSum;
        addSum = t.val;
        revIn(t.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        revIn(root);
        return root;
    }
}
