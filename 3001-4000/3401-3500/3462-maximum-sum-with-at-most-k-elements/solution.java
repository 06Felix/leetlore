class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        Queue<int[]> q = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m; j++)
                q.offer(new int[]{grid[i][j], i});
        long ans = 0;
        while(k > 0){
            int[] cur = q.poll();
            int row = cur[1];
            if(limits[row] == 0)
                continue;
            ans += cur[0];
            limits[row]--;
            k--;
        }
        return ans;
    }
}
