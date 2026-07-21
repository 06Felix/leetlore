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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for(int d : to_delete)
            st.add(d);
        dfs(root, st, true, ans);
        return ans;
    }
    private TreeNode dfs(TreeNode r, Set<Integer> st, boolean isR, List<TreeNode> ans){
        if(r == null)
            return null;
        boolean del = st.contains(r.val);
        if(isR && !del)
            ans.add(r);
        r.left = dfs(r.left ,st, del, ans);
        r.right = dfs(r.right ,st, del, ans);
        return del ? null : r;
    }
}
