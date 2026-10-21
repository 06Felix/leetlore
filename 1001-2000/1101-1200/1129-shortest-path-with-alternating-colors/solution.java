class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        List<Integer>[] red = new ArrayList[n];
        List<Integer>[] blue = new ArrayList[n];
        List<Integer>[] adj;
        for(int i = 0 ; i < n ; i++){
            red[i] = new ArrayList<>();
            blue[i] = new ArrayList<>();
        }
        for(int[] edge : redEdges){
            int u = edge[0];
            int v = edge[1];
            red[u].add(v);
        }
        for(int[] edge : blueEdges){
            int u = edge[0];
            int v = edge[1];
            blue[u].add(v);
        }
        Queue<int[]> q = new ArrayDeque<>();
        int[] vis = new int[n];
        vis[0] = 0;
        ans[0] = 0;
        q.offer(new int[]{0, 0});
        q.offer(new int[]{0, 1});
        int ct = 0;
        while(!q.isEmpty()){
            ct++;
            for(int sz = q.size() ; sz > 0 ; sz--){
                int[] cur = q.poll();
                int u = cur[0];
                int reqColor = cur[1] ^ 1;
                adj = (reqColor == 0 ? red : blue);
                for(int v : adj[u])
                    if((vis[v] & (1 << reqColor)) == 0){
                        vis[v] |= (1 << reqColor);
                        if(ans[v] == -1)
                            ans[v] = ct;
                        q.offer(new int[]{v, reqColor});
                    }
            }
        }
        return ans;
    }
}
