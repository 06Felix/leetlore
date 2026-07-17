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
    private int mode = 1;
    private int count(TreeNode t,int n){
        if(t == null)
            return 0;
        return  (t.val == n ? 1 : 0) + count(t.left,n) + count(t.right,n);
    }
    private List<Integer> l = new ArrayList<>();
    private void traverse(TreeNode t){
        if(t == null)
            return;
        int ct = count(t,t.val);
        if(ct > mode){
            mode = ct;
            l.clear();
            l.add(t.val);
        }
        else if(ct == mode)
            l.add(t.val);
        traverse(t.left);
        traverse(t.right);
    }
    public int[] findMode(TreeNode root) {
        traverse(root);
        int[] ans = new int[l.size()];
        for(int i=0;i<l.size();i++)
            ans[i] = l.get(i);
        return ans;
    }
}
