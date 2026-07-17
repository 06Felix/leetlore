class Solution {
    private int addSum = 0;
    private void revIn(TreeNode t){
        if(t == null)
            return;
        revIn(t.right);
        t.val += addSum;
        addSum = t.val;
        revIn(t.left);
    }
    public TreeNode convertBST(TreeNode root) {
        revIn(root);
        return root;
    }
}
