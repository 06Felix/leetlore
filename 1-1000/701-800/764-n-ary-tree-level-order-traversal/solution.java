/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            for(int sz = q.size() ; sz > 0 ; sz--){
                Node cur = q.poll();
                l.add(cur.val);
                if(cur.children != null){
                    for(Node ch : cur.children)
                        q.offer(ch);
                }
            }
            ans.add(l);
        }
        return ans;
    }
}
