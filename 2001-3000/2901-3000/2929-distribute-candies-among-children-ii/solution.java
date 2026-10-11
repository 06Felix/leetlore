class Solution {
    private long ways(int n) {
        if (n < 0)
            return 0;
        long ans = 1;
        for (int i = 1; i <= 2; i++)
            ans = ans * (n - i + 3) / i;
        return ans;
    }
    public long distributeCandies(int n, int limit) {
        ++limit;
        long c1 = ways(n - limit);
        long c2 = ways(n - 2 * limit);
        long c3 = ways(n - 3 * limit);
        return ways(n) - 3 * c1 + 3 * c2 - c3;
    }
}
