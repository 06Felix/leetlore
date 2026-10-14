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
    private int ans = 0;
    private void find(TreeNode node, int val) {
        if (node == null)
            return;
        int newVal = val * 10 + node.val;
        if (node.left == null && node.right == null) {
            ans += newVal;
            return;
        }
        find(node.left, newVal);
        find(node.right, newVal);
    }
    public int sumNumbers(TreeNode root) {
        find(root, 0);
        return ans;
    }
}
