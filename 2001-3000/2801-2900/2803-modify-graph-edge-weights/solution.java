class Solution {
  public int[][] modifiedGraphEdges(int n, int[][] edges, int source, int destination, int target) {
    int mx = 2_000_000_000;
    List<Pair<Integer, Integer>>[] graph = new List[n];

    for (int i = 0; i < n; i++)
      graph[i] = new ArrayList<>();

    for (int[] edge : edges) {
      int u = edge[0];
      int v = edge[1];
      int w = edge[2];
      if (w == -1)
        continue;
      graph[u].add(new Pair<>(v, w));
      graph[v].add(new Pair<>(u, w));
    }

    int distToDestination = dijkstra(graph, source, destination);
    if (distToDestination < target)
      return new int[0][];
    if (distToDestination == target) {
      for (int[] edge : edges)
        if (edge[2] == -1)
          edge[2] = mx;
      return edges;
    }

    for (int i = 0; i < edges.length; ++i) {
      int u = edges[i][0];
      int v = edges[i][1];
      int w = edges[i][2];
      if (w != -1)
        continue;
      edges[i][2] = 1;
      graph[u].add(new Pair<>(v, 1));
      graph[v].add(new Pair<>(u, 1));
      distToDestination = dijkstra(graph, source, destination);
      if (distToDestination <= target) {
        edges[i][2] += target - distToDestination;
        for (int j = i + 1; j < edges.length; ++j)
          if (edges[j][2] == -1)
            edges[j][2] = mx;
        return edges;
      }
    }
    return new int[0][];
  }

  private int dijkstra(List<Pair<Integer, Integer>>[] graph, int src, int dst) {
    int[] dist = new int[graph.length];
    Arrays.fill(dist, Integer.MAX_VALUE);
    Queue<Pair<Integer, Integer>> minHeap =
        new PriorityQueue<>((a, b) -> a.getKey().compareTo(b.getKey()));

    dist[src] = 0;
    minHeap.offer(new Pair<>(dist[src], src));

    while (!minHeap.isEmpty()) {
      int d = minHeap.peek().getKey();
      int u = minHeap.poll().getValue();
      if (d > dist[u])
        continue;
      for (Pair<Integer, Integer> pair : graph[u]) {
        int v = pair.getKey();
        int w = pair.getValue();
        if (d + w < dist[v]) {
          dist[v] = d + w;
          minHeap.offer(new Pair<>(dist[v], v));
        }
      }
    }

    return dist[dst];
  }
}
