class Solution {
    public double find(int a, int b, double[][] memo) {
        if (a <= 0 && b > 0)
            return 1.0;
        if (a == 0 && b == 0)
            return 0.5;
        if (a > 0 && b <= 0)
            return 0.0;
        if (a <= 0 && b <= 0)
            return 0.5;
        if (memo[a][b] != -1)
            return memo[a][b];

        double x = 0.25 * find(a - 100, b, memo);
        double y = 0.25 * find(a - 75, b - 25, memo);
        double z = 0.25 * find(a - 50, b - 50, memo);
        double w = 0.25 * find(a - 25, b - 75, memo);

        return memo[a][b] = w + x + y + z;
    }

    public double soupServings(int n) {
        if (n > 4800)
            return 1.0;
        double[][] memo = new double[n + 1][n + 1];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
                memo[i][j] = -1;
        return find(n, n, memo);
    }
}
