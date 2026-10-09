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
class FindElements {
    private Set<Integer> s;
    public FindElements(TreeNode root) {
        s = new HashSet<>();
        dfs(root, 0);
    }
    
    public boolean find(int target) {
        return s.contains(target);
    }
    private void dfs(TreeNode t, int n){
        if(t == null)
            return;
        s.add(n);
        dfs(t.left, 2 * n + 1);
        dfs(t.right, 2 * n + 2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
