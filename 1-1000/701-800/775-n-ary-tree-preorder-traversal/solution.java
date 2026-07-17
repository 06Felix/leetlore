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
    private List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        trav(root);
        return ans;
    }
    private void trav(Node t){
        if(t == null || t.children == null)
            return;
        ans.add(t.val);
        for(Node n : t.children)
            trav(n);
    }
}
