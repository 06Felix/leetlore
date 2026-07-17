/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return trav(cloned,target);
    }
    private TreeNode trav(TreeNode tn,TreeNode t){
        if(tn == null)
            return null;
        if(tn.val == t.val)
            return tn;
        TreeNode l = trav(tn.left,t);
        if(l != null)
                return l;
        return trav(tn.right,t);
    }
}
