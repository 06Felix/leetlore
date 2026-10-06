class UnionFind{
    private int[] parent;
    private int[] rank;
    UnionFind(int n){
        parent = new int[n];
        rank = new int[n];
        for(int i = 0 ; i < n ; i++)
            parent[i] = i;
    }
    int find(int u){
        return u == parent[u] ? u : (parent[u] = find(parent[u]));
    }
    boolean unionByRank(int u, int v){
        int i = find(u);
        int j = find(v);
        if(i == j)
            return true;
        if(rank[i] < rank[j])
            parent[i] = j;
        else if(rank[j] < rank[i])
            parent[j] = i;
        else{
            parent[j] = i;
            rank[i]++;
        }
        return false;
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        int extra = 0;
        int curComp = n;
        UnionFind uf = new UnionFind(n);
        for(int[] con : connections){
            int u = con[0];
            int v = con[1];
            if(uf.unionByRank(u, v))
                extra++;
            else
                curComp--;
        }
        return extra >= curComp - 1 ? curComp - 1 : -1;
    }
}
