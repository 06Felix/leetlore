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
    private int ans = Integer.MAX_VALUE;
    private TreeNode pN;  
    public void trav(TreeNode root) {
        if(root == null) 
            return;
        trav(root.left);
        if(pN != null && ans > root.val - pN.val)
            ans = root.val - pN.val;
        pN = root;
        trav(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        trav(root);
        return ans;
    }

}
