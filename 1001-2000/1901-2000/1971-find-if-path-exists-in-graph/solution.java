class UnionFind {
    private int[] id;
    public UnionFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; ++i)
            id[i] = i;
    }
    public void unionByRank(int u, int v) {
        id[find(u)] = find(v);
    }
    public int find(int u) {
        return id[u] == u ? u : (id[u] = find(id[u]));
    }
}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind uf = new UnionFind(n);
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            uf.unionByRank(u, v);
        }
        return uf.find(source) == uf.find(destination);
    }
}
