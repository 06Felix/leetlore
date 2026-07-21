class UnionFind {
  public int count;
  private int[] id;
  private int[] rank;
  public UnionFind(int n) {
    count = n;
    id = new int[n];
    rank = new int[n];
    for (int i = 0; i < n; ++i)
      id[i] = i;
  }

  public boolean unionByRank(int u, int v) {
    int i = find(u);
    int j = find(v);
    if (i == j)
      return false;
    if (rank[i] < rank[j]) {
      id[i] = j;
    } else if (rank[i] > rank[j]) {
      id[j] = i;
    } else {
      id[i] = j;
      ++rank[j];
    }
    --count;
    return true;
  }


  private int find(int u) {
    return id[u] == u ? u : (id[u] = find(id[u]));
  }
}

class Solution {
  public int maxNumEdgesToRemove(int n, int[][] edges) {
    UnionFind alice = new UnionFind(n);
    UnionFind bob = new UnionFind(n);
    int requiredEdges = 0;
    Arrays.sort(edges, (a, b) -> b[0] - a[0]);

    for (int[] edge : edges) {
      int type = edge[0];
      int u = edge[1] - 1;
      int v = edge[2] - 1;
      switch (type) {
        case 3:
          if (alice.unionByRank(u, v) | bob.unionByRank(u, v))
            ++requiredEdges;
          break;
        case 2:
          if (bob.unionByRank(u, v))
            ++requiredEdges;
          break; 
        case 1:
          if (alice.unionByRank(u, v))
            ++requiredEdges;
      }
    }

    return alice.count == 1 && bob.count == 1 ? edges.length - requiredEdges : -1;
  }
}
