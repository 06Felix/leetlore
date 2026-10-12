class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= maxPts + k - 1)
            return 1;
        if (k == 1 && n >= maxPts)
            return 1;
        double[] dp = new double[n + 1];
        dp[0] = 1;
        double curSum = 1;
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = curSum / maxPts;
            if (i < k)
                curSum += dp[i];
            else
                ans += dp[i];
            if (i >= maxPts)
                curSum -= dp[i - maxPts];
        }
        return ans;
    }
}

// 1   2   3   4   5   6   7   8   9   10  11  12

// 17 18 19 20 21 22 23 24 25 26

// k -> k + maxPts - 1
