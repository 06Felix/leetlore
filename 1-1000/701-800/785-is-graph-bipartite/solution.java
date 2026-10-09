class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] team = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(team[i] != 0)
                continue;
            Queue<Integer> q = new ArrayDeque<>();
            q.offer(i);
            team[i] = 1;
            while(!q.isEmpty()){
                int cur = q.poll();
                for(int j : graph[cur]){
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
