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
    private int find(TreeNode root, int p, int gp){
        if(root == null)
            return 0;
        return find(root.left, root.val, p) + find(root.right, root.val, p) + (gp % 2 == 0 ? root.val : 0);
    }
    public int sumEvenGrandparent(TreeNode root) {
        return find(root, -1, -1);
    }
}
