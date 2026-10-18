class Node {
    public int count;
    public Set<String> keys = new HashSet<>();
    public Node prev = null;
    public Node next = null;

    public Node(int count) {
        this.count = count;
    }

    public Node(int count, String key) {
        this.count = count;
        keys.add(key);
    }
}

class AllOne {
    private Map<String, Node> keyToNode = new HashMap<>();
    private Node head = new Node(0);
    private Node tail = new Node(0);
    public AllOne() {
        head.next = tail;
        tail.prev = head;
    }

    public void inc(String key) {
        if (keyToNode.containsKey(key))
            incrementExistingKey(key);
        else
            addNewKey(key);
    }

    public void dec(String key) {
        Node node = keyToNode.get(key);
        node.keys.remove(key);

        if (node.count > 1) {
            if (node.prev == head || node.prev.count != node.count - 1)
                insertAfter(node.prev, new Node(node.count - 1));
            node.prev.keys.add(key);
            keyToNode.put(key, node.prev);
        } else {
            keyToNode.remove(key);
        }

        if (node.keys.isEmpty())
            remove(node);
    }

    public String getMaxKey() {
        return tail.prev == head ? "" : tail.prev.keys.iterator().next();
    }

    public String getMinKey() {
        return head.next == tail ? "" : head.next.keys.iterator().next();
    }

    private void addNewKey(String key) {
        if (head.next.count == 1)
            head.next.keys.add(key);
        else
            insertAfter(head, new Node(1, key));
        keyToNode.put(key, head.next);
    }

    private void incrementExistingKey(String key) {
        Node node = keyToNode.get(key);
        node.keys.remove(key);

        if (node.next == tail || node.next.count > node.count + 1)
            insertAfter(node, new Node(node.count + 1));

        node.next.keys.add(key);
        keyToNode.put(key, node.next);

        if (node.keys.isEmpty())
            remove(node);
    }

    private void insertAfter(Node node, Node newNode) {
        newNode.prev = node;
        newNode.next = node.next;
        node.next.prev = newNode;
        node.next = newNode;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
