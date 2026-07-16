class Solution {
  public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
    final int n = edges.length + 1;
    int[] ans = new int[n];
    List<Pair<Integer, Integer>>[] graph = new List[n];

    for (int i = 0; i < n; i++)
      graph[i] = new ArrayList<>();

    for (int[] edge : edges) {
      int u = edge[0];
      int v = edge[1];
      int w = edge[2];
      graph[u].add(new Pair<>(v, w));
      graph[v].add(new Pair<>(u, w));
    }

    for (int i = 0; i < n; ++i)
      ans[i] = connectablePairsRootedAt(graph, i, signalSpeed);

    return ans;
  }

  private int connectablePairsRootedAt(List<Pair<Integer, Integer>>[] graph, int u,
                                       int signalSpeed) {
    int pairs = 0;
    int count = 0;
    for (Pair<Integer, Integer> pair : graph[u]) {
      int v = pair.getKey();
      int w = pair.getValue();
      int childCount = dfs(graph, v, u, w, signalSpeed);
      pairs += count * childCount;
      count += childCount;
    }
    return pairs;
  }

  private int dfs(List<Pair<Integer, Integer>>[] graph, int u, int prev, int dist,
                  int signalSpeed) {
    int count = 0;
    for (Pair<Integer, Integer> pair : graph[u]) {
      int v = pair.getKey();
      int w = pair.getValue();
      if (v == prev)
        continue;
      count += dfs(graph, v, u, dist + w, signalSpeed);
    }
    return (dist % signalSpeed == 0 ? 1 : 0) + count;
  }
}
