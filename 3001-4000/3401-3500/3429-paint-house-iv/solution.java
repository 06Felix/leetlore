class Solution {
    public long minCost(int n, int[][] cost) {
        Long[][][] memo = new Long[n + 1][4][4];
        return find(0, cost, 3, 3, memo);
    }
    private long find(int i, int cost[][], int lC, int rC, Long[][][] memo) {
        int n = cost.length;
        if(i >= (n >> 1))
            return 0;
        if(memo[i][lC][rC] != null)
            return memo[i][lC][rC];
        long ans = Long.MAX_VALUE;
        for(int j = 0 ; j < 3 ; j++) {
            if(j == lC)
                continue;
            for(int k = 0 ; k < 3 ; k++) {
                if(k == j || k == rC)
                    continue;
                ans = Math.min(ans, cost[i][j] + cost[n - 1 - i][k] + find(i + 1, cost, j, k, memo));
            }
        }
        return memo[i][lC][rC] = ans;
    }
}
