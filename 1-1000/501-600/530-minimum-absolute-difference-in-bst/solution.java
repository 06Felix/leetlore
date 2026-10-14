class Solution {
    private int ans = Integer.MAX_VALUE;
    private TreeNode previousNode;
    public void trav(TreeNode root) {
        if(root == null) 
            return;
        trav(root.left);
        if(previousNode != null && ans > root.val - previousNode.val)
            ans = root.val - previousNode.val;
        previousNode = root;
        trav(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        trav(root);
        return ans;
    }

}
