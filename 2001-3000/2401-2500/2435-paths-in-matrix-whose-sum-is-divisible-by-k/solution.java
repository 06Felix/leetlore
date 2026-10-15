class Solution {
    private int[][] grid;
    private int n;
    private int m;
    private int k;
    private Integer[][][] memo;
    private static final int MOD = 1_000_000_007;

    public int numberOfPaths(int[][] grid, int k) {
        this.grid = grid;
        this.k = k;
        this.n = grid.length;
        this.m = grid[0].length;
        this.memo = new Integer[n][m][k];
        return numberOfPaths(0, 0, 0);
    }

    private int numberOfPaths(int i, int j, int sum) {
        if (i == n || j == m)
            return 0;
        if (i == n - 1 && j == m - 1)
            return (sum + grid[i][j]) % k == 0 ? 1 : 0;
        if (memo[i][j][sum] != null)
            return memo[i][j][sum];
        int newSum = (sum + grid[i][j]) % k;
        return memo[i][j][sum] = (numberOfPaths(i + 1, j, newSum) +
                numberOfPaths(i, j + 1, newSum)) % MOD;
    }
}
