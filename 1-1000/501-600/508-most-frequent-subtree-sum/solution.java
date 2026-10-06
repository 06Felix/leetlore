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
    private Map<Integer, Integer> m1 = new HashMap<>();
    private Map<Integer, List<Integer>> m2 = new HashMap<>();
    int maxFreq = 0;
    private int dfs(TreeNode t){
        if(t == null)
            return 0;
        int ans = t.val + dfs(t.left) + dfs(t.right);
        m1.merge(ans, 1, Integer :: sum);
        int ct = m1.get(ans);
        maxFreq = Math.max(maxFreq, ct);
        m2.putIfAbsent(ct, new ArrayList<>());
        m2.get(ct).add(ans);
        return ans;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        List<Integer> res = m2.get(maxFreq);
        int[] ans = new int[res.size()];
        int id = 0;
        for(int x : res)
            ans[id++] = x;
        return ans;
    }
}
