class Solution {
    public int maxFreeTime(int end, int[] st, int[] et) {
        int n = st.length;
        int[] gaps = new int[n + 1];
        gaps[0] = st[0];
        for(int i = 1 ; i < n ; i++)
            gaps[i] = st[i] - et[i - 1];
        gaps[n] = end - et[n - 1];
        int[] suf = new int[n + 1];
        for(int i = n - 1 ; i >= 0 ; i--)
            suf[i] = Math.max(gaps[i + 1], suf[i + 1]);
        int ans = 0;
        int prf = 0;
        for(int i = 1 ; i <= n ; i++){
            int gap = et[i - 1] - st[i - 1];
            if(gap <= Math.max(prf, suf[i]))
                ans = Math.max(ans, gaps[i] + gaps[i - 1] + gap);
            ans = Math.max(gaps[i] + gaps[i - 1], ans);
            prf = Math.max(prf, gaps[i - 1]);
        }
        return ans;
    }
}
