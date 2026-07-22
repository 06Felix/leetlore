class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        long tSum = targetSum;
        return root == null ? 0 : count(root,tSum) + pathSum(root.left,targetSum) + pathSum(root.right, targetSum);
    }
    private int count(TreeNode t, long tr){
        if(t == null)
            return 0;
        return (t.val == tr ? 1 : 0) + count(t.left, tr - t.val) + count(t.right, tr - t.val);
    }
}
