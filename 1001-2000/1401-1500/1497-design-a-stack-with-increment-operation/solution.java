class CustomStack {
  private int maxSize;
  private Deque<Integer> st = new ArrayDeque<>();
  private List<Integer> incs = new ArrayList<>();
  public CustomStack(int maxSize) {
    this.maxSize = maxSize;
  }

  public void push(int x) {
    if (st.size() == maxSize)
      return;
    st.push(x);
    incs.add(0);
  }

  public int pop() {
    if (st.isEmpty())
      return -1;
    int i = st.size() - 1;
    int inc = incs.get(i);
    incs.remove(i);
    if (i > 0)
      incs.set(i - 1, incs.get(i - 1) + inc);
    return st.pop() + inc;
  }

  public void increment(int k, int val) {
    if (st.isEmpty())
      return;
    int i = Math.min(k - 1, st.size() - 1);
    incs.set(i, incs.get(i) + val);
  }

}
