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
    private int countCameras(TreeNode root){
        if(root == null)
            return 1;
        int l = countCameras(root.left);
        int r = countCameras(root.right);
        if(l == -1 || r == -1){ 
            ans++;
            return 0;
        }
        if(l == 0 || r == 0)
            return 1; 
        return -1;
    }
    public int minCameraCover(TreeNode root) {
        return countCameras(root) == -1 ? ans + 1 : ans;
    }
}
