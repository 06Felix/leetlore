class Solution {
    public Node flatten(Node head) {
        return flatten(head, null);
    }

    private Node flatten(Node head, Node rem) {
        if (head == null)
            return rem;
        head.next = flatten(head.child, flatten(head.next, rem));
        if (head.next != null)
            head.next.prev = head;
        head.child = null;
        return head;
    }
}
