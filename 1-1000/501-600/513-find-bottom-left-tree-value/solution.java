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
    private int t = 0;
    private int ans = 0;
    public int findBottomLeftValue(TreeNode root) {
        search(root,1);
        return ans;
    }
    private void search(TreeNode root,int lvl){
        if(root == null)
            return;
        if(lvl > t){
            ans = root.val;
            t = lvl;
        }
        search(root.left,lvl + 1);
        search(root.right,lvl + 1);
    }
}
