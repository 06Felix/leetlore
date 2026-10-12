class Solution {
    public int maxFreeTime(int end, int k, int[] st, int[] et) {
        int n = st.length;
        int[] gaps = new int[n + 1];
        gaps[0] = st[0] - 0;
        for(int i = 1 ; i < n ; i++)
            gaps[i] = st[i] - et[i - 1];
        gaps[n] = end - et[n - 1];
        int[] prf = new int[n + 2];
        for(int i = 1 ; i <= n + 1 ; i++)
            prf[i] = prf[i - 1] + gaps[i - 1];
        int ans = 0;
        for(int i = k + 1 ; i <= n + 1 ; i++)
            ans = Math.max(ans, prf[i] - prf[i - k - 1]);
        return ans;
    }
}
