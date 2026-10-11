class Solution {
    public int maxWeight(int n, int[][] edges, int k, int t) {
        BitSet[] prv = new BitSet[n];
        BitSet[] cur = new BitSet[n];
        for(int i = 0; i < n; i++) {
            prv[i] = new BitSet(601);
            cur[i] = new BitSet(601);
        }
        List<int[]>[] adj = new ArrayList[n];
        for(int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
        for(int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];
            adj[v].add(new int[]{u, w});
        }
        for(int i = 0; i < n; i++)
            prv[i].set(0);
        for(int i = 1; i <= k; i++) {
            for(int v = 0; v < n; v++) {
                cur[v].clear();
                for(int[] e : adj[v]) {
                    int u = e[0];
                    int w = e[1];
                    if(w < t) {
                        BitSet nxt = (BitSet) prv[u].clone();
                        int rng = Math.max(0, t - w);
                        nxt = nxt.get(0, rng);
                        lS(nxt, w);
                        cur[v].or(nxt);
                    }
                }
            }
            BitSet[] tp = prv;
            prv = cur;
            cur = tp;
        }
        for(int w = t - 1; w >= 0; w--)
            for(int i = 0; i < n; i++)
                if(prv[i].get(w))
                    return w;
        return -1;
    }

    void lS(BitSet bs, int sh) {
        for(int i = bs.length() - 1; i >= 0; i--) {
            bs.set(i + sh, bs.get(i));
            bs.clear(i);
        }
    }
}
