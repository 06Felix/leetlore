class Solution {
    private int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        find(root);
        return ans;
    }
    private int find(TreeNode root) {
        if (root == null)
            return 0;
        int l = Math.max(find(root.left), 0);
        int r = Math.max(find(root.right), 0);
        ans = Math.max(ans, root.val + l + r);
        return root.val + Math.max(l, r);
    }
}
