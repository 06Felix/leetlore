class FreqStack {
    HashMap<Integer, Integer> fmap;
    List<Deque<Integer>> stack; 
    int mxFreq;
    public FreqStack() {
        fmap = new HashMap<>();
        stack = new ArrayList<>();
        stack.add(new ArrayDeque<>());
        mxFreq = 0;
    }
    public void push(int x) {
        int freq = fmap.getOrDefault(x, 0) + 1;
        fmap.put(x, freq);
        if (freq == mxFreq + 1){
            mxFreq = freq;
            stack.add(new ArrayDeque<>());
        }
        stack.get(freq).push(x);
    }

    public int pop() {
        Deque<Integer> top = stack.get(mxFreq);
        int x = top.pop();
        if (top.size() == 0){
            mxFreq--;
        }
        fmap.put(x, fmap.get(x) - 1);
        return x;
    }
}
