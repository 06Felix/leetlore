class Node{
    int n;
    Node l = null;
    Node r = null;
}
class MyLinkedList {
    Node h = null, t = null;
    int size = 0;    
    public int get(int i) {
        if(i < 0 || i >= size)
            return -1;
        if(i == 0)
            return h.n;
        else if(i == size - 1)
            return t.n;
        else{
            Node tp = h;
            while(i-- > 0)
                tp = tp.r;
            return tp.n;
        }
    }
    
    public void addAtHead(int val) {
        Node nn = new Node();
        nn.n = val;
        size++;
        if(h == null){
            h = nn;
            t = nn;
            return;
        }
        nn.r = h;
        h.l = nn;
        h = nn;
    }
    
    public void addAtTail(int val) {
        Node nn = new Node();
        nn.n = val;
        size++;
        if(t == null){
            h = nn;
            t = nn;
            return;
        }
        nn.l = t;
        t.r = nn;
        t = nn;
    }
    
    public void addAtIndex(int i, int val) {
        if(i > size || i < 0)
            return;
        if(i == 0)
            addAtHead(val);
        else if(i == size)
            addAtTail(val);
        else{
            Node nn = new Node();
            nn.n = val;
            size++;
            Node tp = h;
            while(--i > 0)
                tp = tp.r;
            Node nx = tp.r;
            nx.l = nn;
            tp.r = nn;
            nn.l = tp;
            nn.r = nx;
        }

    }
    
    public void deleteAtIndex(int i) {
        if(i >= size || i < 0)
            return;
        if(i == 0){
            h = h.r;
            if(h != null)
                h.l = null;
        }
        else if(i == size - 1){
            t = t.l;
            if(t != null)
                t.r = null;
        }
        else{
            Node tp = h;
            while(--i > 0)
                tp = tp.r;
            tp.r = tp.r.r;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
