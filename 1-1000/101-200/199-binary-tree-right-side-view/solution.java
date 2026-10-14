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
    List<Integer> ans = new ArrayList<>();
    int level = 0;
    public List<Integer> rightSideView(TreeNode root) {
        find(root, 0);
        return ans;
    }
    private void find(TreeNode node, int lvl) {
        if (node == null)
            return;
        if (level == lvl) {
            ans.add(node.val);
            level++;
        }
        find(node.right, lvl + 1);
        find(node.left, lvl + 1);
    }
}
