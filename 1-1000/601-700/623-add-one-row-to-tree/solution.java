class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1)
            return new TreeNode(val,root,null);
        return addNode(root,1,depth,val);
    }
    private TreeNode addNode(TreeNode root, int cd, int d, int val){
        if(root == null || cd >= d)
            return root;
        if(cd == d - 1){
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
            return root;
        }
        root.left = addNode(root.left, cd + 1, d, val);
        root.right = addNode(root.right, cd + 1, d, val);
        return root;
    }
}
