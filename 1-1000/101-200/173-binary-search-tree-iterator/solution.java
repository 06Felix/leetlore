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
class BSTIterator {
    private Queue<Integer> q = new LinkedList<>();
    public BSTIterator(TreeNode root) {
        inO(root);
    }
    private void inO(TreeNode root){
        if(root == null)
            return;
        inO(root.left);
        q.offer(root.val);
        inO(root.right);
    }
    
    public int next() {
        return q.poll();
    }
    
    public boolean hasNext() {
        return q.size() != 0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
