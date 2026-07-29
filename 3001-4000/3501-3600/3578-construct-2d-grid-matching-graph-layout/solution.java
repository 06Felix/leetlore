class Solution {
  public int[][] constructGridLayout(int n, int[][] edges) {
    List<Integer>[] graph = new ArrayList[n];

    for (int i = 0; i < n; i++)
      graph[i] = new ArrayList<>();

    for (int[] edge : edges) {
      int u = edge[0];
      int v = edge[1];
      graph[u].add(v);
      graph[v].add(u);
    }
    int corner = 0;
    for (int i = 1; i < n; i++)
      if (graph[i].size() < graph[corner].size())
        corner = i;

    boolean[] vis = new boolean[n];
    vis[corner] = true;
    int[] r1 = getr1(graph, corner, vis);
    int cols = r1.length;
    int rows = n / cols;
    int[][] ans = new int[rows][cols];
    ans[0] = r1;
    for (int i = 1; i < rows; ++i)
      for (int j = 0; j < cols; ++j)
        for (int v : graph[ans[i - 1][j]])
          if (!vis[v]) {
            ans[i][j] = v;
            vis[v] = true;
            break;
          }
    return ans;
  }

  private int[] getr1(List<Integer>[] graph, int corner, boolean[] vis) {
    int cDeg = graph[corner].size();
    List<Integer> row = new ArrayList<>(List.of(corner));
    while (row.size() == 1 || graph[row.get(row.size() - 1)].size() == cDeg + 1) {
      List<Integer> neighbors = graph[row.get(row.size() - 1)];
      Collections.sort(neighbors, (a, b) -> graph[a].size() - graph[b].size());
      for (int v : neighbors)
        if (!vis[v] && (graph[v].size() == cDeg || graph[v].size() == cDeg + 1)) {
          row.add(v);
          vis[v] = true;
          break;
        }
    }
    return row.stream().mapToInt(Integer::intValue).toArray();
  }
}
