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
        id[i] = j;
        return false;
    }
}
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        UF uf = new UF(edges.length + 1);
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            if(uf.ubr(u, v))
                return edge;
        }
        return new int[]{};
    }
}
