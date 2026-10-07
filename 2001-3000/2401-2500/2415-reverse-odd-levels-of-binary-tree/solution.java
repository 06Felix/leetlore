class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left, root.right, true);
        return root;
    }
    private void dfs(TreeNode l, TreeNode r, boolean odd) {
        if (l == null)
            return;
        if (odd) {
            int t = l.val;
            l.val = r.val;
            r.val = t;
        }
        dfs(l.left, r.right, !odd);
        dfs(l.right, r.left, !odd);
    }
}
