class Solution {
    public int shortestPathLength(int[][] arr) {
        int n = arr.length;
        if(n <= 3)
            return n - 1;
        int req = (1 << n) - 1;
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] vis = new boolean[n][req + 1];
        for(int i = 0 ; i < n ; i++)
            q.offer(new int[]{i, 1 << i});
        int ans = 0;
        while(!q.isEmpty()){
            for(int z = q.size() ; z > 0 ; z--){
                int[] cur = q.poll();
                int u = cur[0];
                int st = cur[1];
                if(vis[u][st])
                    continue;
                if(st == req)
                    return ans;
                for(int v : arr[u])
                    q.offer(new int[]{v, st | 1 << v});
                vis[u][st] = true;
            }
            ans++;
        }
        return ans;
    }
}
