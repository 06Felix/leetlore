class Solution {
    public String tree2str(TreeNode t) {
        return dfs(t).toString();
    }

    private StringBuilder dfs(TreeNode root) {
        if (root == null)
            return new StringBuilder();
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        if (root.right != null)
            return sb.append("(").append(dfs(root.left)).append(")(").append(dfs(root.right)).append(")");
        if (root.left != null)
            return sb.append("(").append(dfs(root.left)).append(")");
        return sb;
    }
}
