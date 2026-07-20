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
    public int goodNodes(TreeNode root) {
        return find(root, Integer.MIN_VALUE);
    }
    private int find(TreeNode t, int cM){
        if(t == null)
            return 0;
        int nM = Math.max(t.val, cM);
        return (t.val >= cM ? 1 : 0) + find(t.left, nM) + find(t.right, nM);
    }
}
