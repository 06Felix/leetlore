class Solution {
    public boolean possibleBipartition(int n, int[][] edges) {
        List<Integer>[] adj = new List[n + 1];
        for(int i = 0 ; i <= n ; i++)
            adj[i] = new ArrayList<>();
        for(int[] e : edges){
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        int[] team = new int[n + 1];
        for(int i = 1 ; i <= n ; i++){
            if(team[i] != 0)
                continue;
            Queue<Integer> q = new ArrayDeque<>();
            q.offer(i);
            team[i] = 1;
            while(!q.isEmpty()){
                int cur = q.poll();
                for(int j : adj[cur]){
                    if(team[j] == team[cur])
                        return false;
                    if(team[j] == 0){
                        team[j] = team[cur] ^ 3;
                        q.offer(j);
                    }
                }
            }
        }
        return true;
    }
}
