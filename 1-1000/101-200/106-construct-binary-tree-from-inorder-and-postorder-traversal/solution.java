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
    private int[] inOrder;
    private int[] postOrder;
    private Map<Integer, Integer> inIdx = new HashMap<>();;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inOrder = inorder;
        this.postOrder = postorder;
        int n = inorder.length;
        for (int i = 0; i < n; i++)
            inIdx.put(inorder[i], i);
        return build(0, n - 1, 0, n - 1);
    }
    private TreeNode build(int inStart, int inEnd, int postStart, int postEnd) {
        if (postStart > postEnd)
            return null;

        int nodeVal = postOrder[postEnd];
        int inOrderIdx = inIdx.get(nodeVal);
        int rightSize = inEnd - inOrderIdx;
        int leftSize = inOrderIdx - inStart;
        
        TreeNode node = new TreeNode(nodeVal);
        node.left = build(inStart, inOrderIdx - 1, postStart, postStart + leftSize - 1);
        node.right = build(inOrderIdx + 1, inEnd, postStart + leftSize, postEnd - 1);

        return node;
    }
}
