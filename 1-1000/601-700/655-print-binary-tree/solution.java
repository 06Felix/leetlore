class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int m = height(root);
        int n = (int) Math.pow(2, m) - 1;
        List<List<String>> ans = new ArrayList<>();
        List<String> row = new ArrayList<>();
        for (int i = 0; i < n; i++)
            row.add("");
        for (int i = 0; i < m; i++)
            ans.add(new ArrayList<>(row));
        dfs(root, 0, 0, n - 1, ans);
        return ans;
    }
    private int height(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    private void dfs(TreeNode root, int row, int l, int r, List<List<String>> ans) {
        if (root == null)
            return;
        int m = (l + r) / 2;
        ans.get(row).set(m, Integer.toString(root.val));
        dfs(root.left, row + 1, l, m - 1, ans);
        dfs(root.right, row + 1, m + 1, r, ans);
    }
}
