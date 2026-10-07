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
    private void dfs(TreeNode t, int mn, int mx){
        if(t == null)
            return;
        ans = Math.max(ans, Math.abs(mn - t.val));
        ans = Math.max(ans, Math.abs(mx - t.val));
        mn = Math.min(mn, t.val);
        mx = Math.max(mx, t.val);
        dfs(t.left, mn, mx);
        dfs(t.right, mn, mx);
    }
    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return ans;
    }
}
