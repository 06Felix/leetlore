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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);
        return findLevel(root, xx, 0) == findLevel(root, yy, 0) && !isSibling(root, xx, yy);
    }
    TreeNode findNode(TreeNode root, int val){
        if(root == null) return root;
        if(root.val == val) return root;
        TreeNode left = findNode(root.left, val);
        if(left != null){
            return left;
        }
        return findNode(root.right, val);
    }

    int findLevel(TreeNode root, TreeNode node, int level){
        if(root == null) return 0;
        if(root.val == node.val) return level;
        int left = findLevel(root.left, node, level+1);
        if(left != 0) return left;
        return findLevel(root.right, node, level+1);
    }
    boolean isSibling(TreeNode root, TreeNode node1, TreeNode node2){
        if(root == null) return false;
        return (root.left == node1 && root.right == node2) || (root.left == node2 && root.right == node1) || isSibling(root.left, node1, node2) || isSibling(root.right, node1, node2);
    }

}
