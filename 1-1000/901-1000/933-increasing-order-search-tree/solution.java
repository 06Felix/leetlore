class Solution {
  public TreeNode increasingBST(TreeNode root) {
    return convert(root, null);
  }
  private TreeNode convert(TreeNode root, TreeNode tail) {
    if (root == null)
        return tail;
    TreeNode ans = convert(root.left, root);
    root.left = null;
    root.right = convert(root.right, tail);
    return ans;
  }
}
