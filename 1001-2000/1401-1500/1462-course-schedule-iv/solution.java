class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] edges, int[][] queries) {
        boolean[][] dp = new boolean[n][n];
        List<Integer>[] adj = new ArrayList[n];
        for(int i = 0 ; i < n ; i++)
            adj[i] = new ArrayList<>();
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
        }
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < n ; i++){
            q.offer(i);
            while(!q.isEmpty()){
                int u = q.poll();
                for(int v : adj[u])
                    if(!dp[i][v]){
                        dp[i][v] = true;
                        q.offer(v);
                    }
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for(int[] query : queries){
            int u = query[0];
            int v = query[1];
            ans.add(dp[u][v]);
        }
        return ans;
    }
}
