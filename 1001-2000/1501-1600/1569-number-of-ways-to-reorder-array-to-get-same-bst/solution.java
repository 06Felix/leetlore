class Solution {
    private static final long MOD = 1_000_000_007L;

    private long[][] comb;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        comb = new long[n + 1][n + 1];

        for (int i = 0; i <= n; ++i) {
            comb[i][0] = 1;
            comb[i][i] = 1;

            for (int j = 1; j < i; ++j)
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
        }

        List<Integer> arr = new ArrayList<>();

        for (int num : nums)
            arr.add(num);

        return (int) ((count(arr) - 1 + MOD) % MOD);
    }

    private long count(List<Integer> arr) {
        int n = arr.size();

        if (n <= 2)
            return 1;

        int root = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int num : arr) {
            if (num < root)
                left.add(num);
            else if (num > root)
                right.add(num);
        }

        long ways = comb[n - 1][left.size()];
        ways = ways * count(left) % MOD;

        return ways * count(right) % MOD;
    }
}
