class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> q1 = new ArrayDeque<>();
        Queue<TreeNode> q2 = new ArrayDeque<>();
        dfs(root1, q1);
        dfs(root2, q2);
        while(!q1.isEmpty() && !q2.isEmpty())
            if(q1.poll().val != q2.poll().val)
                return false;
        return q1.isEmpty() && q2.isEmpty();
    }

    public void dfs(TreeNode node, Queue<TreeNode> q) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            q.offer(node);
            return;
        }
        dfs(node.left, q);
        dfs(node.right, q);
    }
}
