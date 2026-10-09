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
class T{
    TreeNode node;
    int level;
    T(TreeNode node, int l1){
        this.node = node;
        level = l1;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<T> q = new PriorityQueue<>((T1, T2) -> T1.level == T2.level ? T1.node.val - T2.node.val : T1.level - T2.level);
        q.offer(new T(root, 0));
        while(!q.isEmpty()){
            List<T> push = new ArrayList<>();
            for(int sz = q.size() ; sz > 0 ; sz--){
                T cur = q.poll();
                TreeNode t = cur.node;
                int hl = cur.level;
                map.putIfAbsent(hl, new ArrayList<>());
                map.get(hl).add(t.val);
                if(t.left != null)
                    push.add(new T(t.left, hl - 1));
                if(t.right != null)
                    push.add(new T(t.right, hl + 1));
            }
            for(T tt : push)
                q.offer(tt);
        }
        for(int l : map.keySet())
            ans.add(map.get(l));
        return ans;
    }
}
