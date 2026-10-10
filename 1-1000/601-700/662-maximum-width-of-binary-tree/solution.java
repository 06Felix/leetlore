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
    private int[] end = new int[3001];
    private int[] st = new int[3001];
    private void dfs(TreeNode root, int d, int i){
        if(root == null)
            return;
        if(st[d] == 0)
            st[d] = i;
        end[d] = i;
        ans = Math.max(ans, end[d] - st[d] + 1);
        dfs(root.left, d + 1, 2 * i + 1);
        dfs(root.right, d + 1, 2 * i + 2);
    }
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 0, 0);
        return ans;
    }
}
