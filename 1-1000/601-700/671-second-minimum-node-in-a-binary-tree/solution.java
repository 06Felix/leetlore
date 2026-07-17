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
    private TreeSet<Integer> ts = new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        trav(root);
        if(ts.size() <= 1)
            return -1; 
        return (int)ts.toArray()[1];
    }
    private void trav(TreeNode t){
        if(t == null)
            return;
        ts.add(t.val);
        trav(t.left);
        trav(t.right);
    }
}
