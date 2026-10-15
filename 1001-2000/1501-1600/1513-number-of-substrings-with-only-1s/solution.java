class Solution {
    private static int MOD = 1_000_000_007;
    public int numSub(String s) {
        int ans = 0;
        int cur = 0;
        for (char ch : s.toCharArray())
            if (ch == '1')
                ans = (ans + ++cur) % MOD;
            else
                cur = 0;
        return ans;
    }
}
