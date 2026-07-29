class Solution {
  public NestedInteger deserialize(String s) {
    if (s.charAt(0) != '[')
      return new NestedInteger(Integer.parseInt(s));
    Deque<NestedInteger> stk = new ArrayDeque<>();
    int start = -1;

    for (int i = 0; i < s.length(); ++i)
      switch (s.charAt(i)) {
        case '[':
          stk.push(new NestedInteger());
          start = i + 1;
          break;
        case ',':
          if (i > start) {
            int num = Integer.parseInt(s.substring(start, i));
            stk.peek().add(new NestedInteger(num));
          }
          start = i + 1;
          break;
        case ']':
          NestedInteger cur = stk.pop();
          if (i > start) {
            int num = Integer.parseInt(s.substring(start, i));
            cur.add(new NestedInteger(num));
          }
          if (!stk.isEmpty())
            stk.peek().add(cur);
          else
            return cur;
          start = i + 1;
          break;
      }
      return null;
  }
}
