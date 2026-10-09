class UnionFind{
    int[] id;
    long[] size;
    int n;
    UnionFind(int n){
        this.n = n;
        id = new int[n];
        size = new long[n];
        for(int i = 0 ; i < n ; i++){
            size[i] = 1;
            id[i] = i;
        }
    }
    void union(int u, int v){
        int i = find(u);
        int j = find(v);
        if(i == j)
            return;
        size[j] += size[i];
        id[i] = j;
    }
    int find(int u){
        return id[u] == u ? u : (id[u] = find(id[u]));
    }
    long countPairs(){
        int pairs = n;
        long ct = 0;
        for(int i = 0 ; i < n ; i++)
            if(id[i] == i){
                ct += (pairs - size[i]) * size[i];
                pairs -= size[i];
            }
        return ct;
    }
}
class Solution {
    public long countPairs(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);
        for(int[] edge : edges)
            uf.union(edge[0], edge[1]);
        return uf.countPairs();
    }
}
