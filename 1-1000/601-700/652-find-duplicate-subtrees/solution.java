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
    private String encode(TreeNode t, Map<String, Integer> m, List<TreeNode> ans){
        if(t == null)
            return "";
        String enc = t.val + "#" + encode(t.left, m, ans) + "#" + encode(t.right, m, ans);
        if(m.merge(enc, 1, Integer::sum) == 2)
            ans.add(t);
        return enc;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        encode(root, m, ans);
        return ans;
    }
}
