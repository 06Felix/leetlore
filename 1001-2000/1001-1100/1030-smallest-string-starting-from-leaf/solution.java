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
    private String ans = "~";
    public String smallestFromLeaf(TreeNode root) {
        find(root, new StringBuilder(""));
        return ans.toString();
    }
    private void find(TreeNode t, StringBuilder sb){
        if(t == null)
            return;
        sb.append((char)(t.val + 97));
        if(t.left == null && t.right == null){
            String rev = sb.reverse().toString();
            if(rev.compareTo(ans) < 0)
                ans = rev;
            sb.reverse();
        }
        find(t.left,sb);
        find(t.right,sb);
        sb.setLength(sb.length() - 1);
    }
}
