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
    private int[] lvlSum = new int[100001];
    private int maxLevel = -1;
    public TreeNode replaceValueInTree(TreeNode root) {
        dfs(root, 0);
        fill(root, 0, 0);
        return root;
    }
    private void dfs(TreeNode root, int level){
        if(root == null){
            maxLevel = Math.max(maxLevel, level - 1);
            return;
        }
        lvlSum[level] += root.val;
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
    private void fill(TreeNode root, int curVal, int level){
        if(root == null)
            return;
        root.val = curVal;
        int nextVal = (level + 1) <= maxLevel ? lvlSum[level + 1] : 0;
        nextVal -= (root.left != null) ? root.left.val : 0;
        nextVal -= (root.right != null) ? root.right.val : 0;
        fill(root.left, nextVal, level + 1);
        fill(root.right, nextVal, level + 1);
    }
}
