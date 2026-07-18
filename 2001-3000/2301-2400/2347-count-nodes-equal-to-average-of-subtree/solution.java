class Solution {
    private int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        ans = 0;
        DFS(root);
        return ans;
    }
    private int[] DFS(TreeNode node) {
        if (node == null) 
            return null;
        int[] left = DFS(node.left);
        int[] right = DFS(node.right);
        int count = 1;
        int sum = node.val;
        if (left != null) {
            count += left[0];
            sum += left[1];
        }
        if (right != null) {
            count += right[0];
            sum += right[1];
        }
        ans += (sum/count == node.val) ? 1 : 0;
        return new int[]{count, sum};
    }
}
