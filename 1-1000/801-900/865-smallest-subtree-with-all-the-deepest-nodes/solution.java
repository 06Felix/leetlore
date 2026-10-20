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
    private record T (TreeNode lca, int depth) {}
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return find(root).lca;
    }
    private T find(TreeNode root) {
        if (root == null)
            return new T(null, 0);
        T left = find(root.left);
        T right = find(root.right);
        if (left.depth > right.depth)
            return new T(left.lca, left.depth + 1);
        if (right.depth > left.depth)
            return new T(right.lca, right.depth + 1);
        return new T(root, left.depth + 1);
    }
}
