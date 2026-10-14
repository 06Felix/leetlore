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
    private int[] arr;
    private TreeNode build (int l, int r) {
        if (l > r)
            return null;
        if (l == r)
            return new TreeNode(arr[l]);
        int m = (l + r) / 2;
        TreeNode node = new TreeNode(arr[m]);
        node.left = build(l, m - 1);
        node.right = build(m + 1, r);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        this.arr = nums;
        return build(0, nums.length - 1);
    }
}
