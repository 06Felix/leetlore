class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        char[][] arr = new char[n][];
        for (int i = 0; i < n; ++i)
            arr[i] = strs[i].toCharArray();
        int k = strs[0].length();
        int[] dp = new int[k];
        Arrays.fill(dp, 1);
        int ans = 1;
        for (int i = 1; i < k; ++i)
            for (int j = 0; j < i; ++j)
                if (isSorted(arr, j, i)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    ans = Math.max(ans, dp[i]);
                }
        return k - ans;
    }

    private boolean isSorted(char[][] arr, int j, int i) {
        for (char[] str : arr)
            if (str[j] > str[i])
                return false;
        return true;
    }
}
