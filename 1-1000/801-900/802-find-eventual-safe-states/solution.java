class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> ans = new ArrayList<>();
        int[] vis = new int[n];
        for(int i = 0 ; i < n ; i++)
            if(!cyclic(graph, i, vis))
                ans.add(i);
        return ans;
    }
    private boolean cyclic(int[][] adj, int u, int[] vis){
        if(vis[u] == 1)
            return true;
        if(vis[u] == 2)
            return false;
        vis[u] = 1;
        for(int v : adj[u])
            if(cyclic(adj, v, vis))
                return true;
        vis[u] = 2;
        return false;
    }
}
