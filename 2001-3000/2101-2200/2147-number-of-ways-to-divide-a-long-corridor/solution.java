class Solution {
    private static int MOD = 1_000_000_007;
    public int numberOfWays(String corridor) {
        long ans = 1;
        boolean first = false;
        int seatCount = 0;
        long prevLast = -1;
        char[] arr = corridor.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == 'P')
                continue;
            first = !first;
            ++seatCount;
            if (first) {
                if (prevLast != -1) {
                    ans = (ans * (i - prevLast)) % MOD;
                }
            } else {
                prevLast = i;
            }
        }
        return seatCount > 1 && !first ? (int) ans : 0;
    }
}
