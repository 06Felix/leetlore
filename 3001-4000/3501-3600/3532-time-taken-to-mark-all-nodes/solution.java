class Solution {
  public int[] timeTaken(int[][] edges) {
    int n = edges.length + 1;
    int[] ans = new int[n];
    List<Integer>[] tree = new List[n];
    Top2[] dp = new Top2[n];

    for (int i = 0; i < n; ++i) {
      tree[i] = new ArrayList<>();
      dp[i] = new Top2();
    }

    for (int[] edge : edges) {
      int u = edge[0];
      int v = edge[1];
      tree[u].add(v);
      tree[v].add(u);
    }

    dfs(tree, 0, -1, dp);
    reroot(tree, 0, -1, 0, dp, ans);
    return ans;
  }

  private record T(int node, int time) {
    T() {
      this(-1, 0);
    }
  }

  private record Top2(T max1, T max2) {
    Top2() {
      this(new T(), new T());
    }
  }

  private int getTime(int u) {
    return u % 2 == 0 ? 2 : 1;
  }

  private int dfs(List<Integer>[] tree, int u, int prev, Top2[] dp) {
    T max1 = new T();
    T max2 = new T();
    for (int v : tree[u]) {
      if (v == prev)
        continue;
      int time = dfs(tree, v, u, dp) + getTime(v);
      if (time >= max1.time()) {
        max2 = max1;
        max1 = new T(v, time);
      } else if (time > max2.time()) {
        max2 = new T(v, time);
      }
    }
    dp[u] = new Top2(max1, max2);
    return max1.time();
  }

  private void reroot(List<Integer>[] tree, int u, int prev, int maxTime, Top2[] dp, int[] ans) {
    ans[u] = Math.max(maxTime, dp[u].max1().time());
    for (int v : tree[u]) {
      if (v == prev)
        continue;
      int newMaxTime =
          getTime(u) +
          Math.max(maxTime, dp[u].max1().node() == v ? dp[u].max2().time() : dp[u].max1().time());
      reroot(tree, v, u, newMaxTime, dp, ans);
    }
  }
}
