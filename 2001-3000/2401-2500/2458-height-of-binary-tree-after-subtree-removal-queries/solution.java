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
    private int mx = 0;
    private int[] preMx = new int[100001];
    private int[] postMx = new int[100001];
    private void preO (TreeNode t, int ht){
        if(t == null)
            return;
        preMx[t.val] = mx;
        mx = Math.max(mx, ht);
        preO(t.left, ht + 1);
        preO(t.right, ht + 1);
    }
    private void postO (TreeNode t, int ht){
        if(t == null)
            return;
        postMx[t.val] = mx;
        mx = Math.max(mx, ht);
        postO(t.right, ht + 1);
        postO(t.left, ht + 1);
    }
    public int[] treeQueries(TreeNode root, int[] queries) {
        preO(root, 0);
        mx = 0;
        postO(root, 0);
        int id = 0;
        int[] ans = new int[queries.length];
        for(int q : queries)
            ans[id++] = Math.max(preMx[q], postMx[q]);
        return ans;
    }
}
