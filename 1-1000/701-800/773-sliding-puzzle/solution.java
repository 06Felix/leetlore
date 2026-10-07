class Solution {
  public int slidingPuzzle(int[][] board) {
    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int m = 2;
    int n = 3;
    String goal = "123450";
    int ans = 0;
    StringBuilder startSb = new StringBuilder();

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        startSb.append((char) ('0' + board[i][j]));

    String start = startSb.toString();

    if (start.equals(goal))
      return 0;

    Queue<String> q = new ArrayDeque<>();
    Set<String> seen = new HashSet<>();
    q.offer(start);
    seen.add(start);

    while (!q.isEmpty()) {
      ans++;
      for (int sz = q.size(); sz > 0; --sz) {
        String s = q.poll();
        int zId = s.indexOf("0");
        int i = zId / n;
        int j = zId % n;
        for (int[] dir : dirs) {
          int x = i + dir[0];
          int y = j + dir[1];
          if (x < 0 || x == m || y < 0 || y == n)
            continue;
          int sId = x * n + y;
          StringBuilder sb = new StringBuilder(s);
          sb.setCharAt(zId, s.charAt(sId));
          sb.setCharAt(sId, s.charAt(zId));
          String t = sb.toString();
          if (t.equals(goal))
            return ans;
          if (!seen.contains(t)) {
            q.offer(t);
            seen.add(t);
          }
        }
      }
    }
    return -1;
  }
}
