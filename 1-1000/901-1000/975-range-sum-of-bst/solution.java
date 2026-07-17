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
    private int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        inO(root,low,high);
        return ans;
    }
    private void inO(TreeNode t, int l, int r){
        if(t == null)
            return;
        inO(t.left,l,r);
        if(t.val >= l && t.val <= r)
            ans += t.val;
        inO(t.right,l,r);
    }
}
