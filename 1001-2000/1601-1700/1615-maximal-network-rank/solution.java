class Solution {
    private int find(int[] deg, int[][] arr, int p, int q){
        int ct = 0;
        for(int[] r : arr)
            if(deg[r[0]] == p && deg[r[1]] == q)
                ct++;
        return ct;
    }
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] deg = new int[n];
        for(int[] road : roads){
            int u = road[0];
            int v = road[1];
            deg[u]++;
            deg[v]++;
        }
        int mx1 = 0, mx2 = 0;
        for(int d : deg){
            if(d >= mx1){
                mx2 = mx1;
                mx1 = d;
            }
            else if(d > mx2)
                mx2 = d;
        }
        int ct1 = 0, ct2 = 0;
        for(int d : deg){
            if(d == mx1)
                ct1++;
            else if(d == mx2)
                ct2++;
        }
        int edges = 0;
        if(ct1 == 1){
            edges = find(deg, roads, mx1, mx2) + find(deg, roads, mx2, mx1);
            return edges == ct2 ? mx1 + mx2 - 1 : mx1 + mx2; 
        }
        edges = find(deg, roads, mx1, mx1);
        return edges == ct1 * (ct1 - 1) / 2 ? (mx1 << 1) - 1 : (mx1 << 1);
    }
}
