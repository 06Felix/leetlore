class UF{
    private int[] rank;
    private int[] id;
    UF(int n){
        rank = new int[n];
        id = new int[n];
        for(int i = 0 ; i < n ; i++)
            id[i] = i;
    }
    private int find(int u){
        return u == id[u] ? u : (id[u] = find(id[u]));
    }
    public boolean ubr(int u, int v){
        int i = find(u);
        int j = find(v);
        if(i == j)
            return true;
        if(rank[i] < rank[j])
            id[i] = j;
        else if(rank[j] < rank[i])
            id[j] = i;
        else{
            id[i] = j;
            rank[i]++;
        }
        return false;
    }
}
class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int twoParents = -1;
        int n = edges.length;
        int[] deg = new int[n + 1];
        for(int[] edge : edges){
            if(++deg[edge[1]] == 2){
                twoParents = edge[1];
                break;
            }
        }
        if(twoParents == -1)
            return find(edges, -1, n);
        for(int i = n - 1 ; i >= 0 ; i--)
            if(edges[i][1] == twoParents && find(edges, i, n).length == 0)
                return edges[i];
        return new int[]{};
    }
    public int[] find(int[][] edges, int skipIndex, int n) {
        UF uf = new UF(n + 1);
        for(int i = 0 ; i < n ; i++){
            if(i == skipIndex)
                continue;
            int u = edges[i][0];
            int v = edges[i][1];
            if(uf.ubr(u, v))
                return edges[i];
        }
        return new int[]{};
    }
}
