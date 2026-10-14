class Solution {
    public Node connect(Node root) {
        Node node = root;

        while (node != null) {
            Node dummy = new Node();
            for (Node needle = dummy; node != null; node = node.next) {
                if (node.left != null) {
                    needle.next = node.left;
                    needle = needle.next;
                }
                if (node.right != null) {
                    needle.next = node.right;
                    needle = needle.next;
                }
            }
            node = dummy.next;
        }

        return root;
    }
}
