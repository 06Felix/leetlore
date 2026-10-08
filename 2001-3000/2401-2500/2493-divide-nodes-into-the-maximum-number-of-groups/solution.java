class Solution {
    public int magnificentSets(int n, int[][] edges) {
        n++;
        List<Integer>[] adj = new ArrayList[n];
        for(int i = 0 ; i < n ; i++)
            adj[i] = new ArrayList<>();
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        if(!isBipartite(adj, n))
            return -1;
        int deg[] = new int[n];
        for(int i = 1; i < n; i++)
            deg[i] = bfs(adj, i);
        int vis[] = new int[n];
        int grp = 0;
        for(int i = 1; i < n; i++)
            if(vis[i] == 0)
                grp += dfs(adj, vis, deg, i);
        return grp;
    }

    public int dfs(List<Integer>[] adj,int vis[], int deg[], int u) {
        vis[u] = 1;
        int mx = deg[u];
        for(int v : adj[u])
            if(vis[v] == 0)
                mx = Math.max(mx, dfs(adj, vis, deg, v));
        return mx;
    }

    public int bfs(List<Integer>[] adj, int u) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{u, 1});
        int vis[] = new int[adj.length];
        vis[u] = 1;
        int ans[] = new int[2];
        while(!q.isEmpty()){
            ans = q.poll();
            for(int v : adj[ans[0]])
                if(vis[v] == 0){
                    vis[v] = 1;
                    q.add(new int[]{v, ans[1] + 1});
                }
        }
        return ans[1];
    }

    public boolean isBipartite(List<Integer>[] adj, int n) {
        int color[] = new int[n];
        for(int i = 0; i < n; i++)
            if(color[i] == 0 && !bfs(adj, color, i))
                return false;
        return true;
    }

    public boolean bfs(List<Integer>[] adj, int color[], int u) {
        color[u] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        while(!q.isEmpty()){
            int ele = q.poll();
            int col = color[ele] == 1 ? 2 : 1;
            for(int v : adj[ele])
                if(color[v] == 0){
                    color[v] = col;
                    q.add(v);
                }
                else if(color[v] != col)
                    return false;
        }
        return true;
    }
}
