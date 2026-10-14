class Solution {
    public int maxFrequency(int[] nums, int k, int numOps) {
        int mx = Arrays.stream(nums).max().getAsInt() + k + 2;
        int[] ct = new int[mx];
        for (int v : nums)
            ct[v]++;
        for (int i = 1; i < mx; i++)
            ct[i] += ct[i - 1];
        int ans = 0;
        for (int i = 0; i < mx; i++) {
            int l = Math.max(0, i - k);
            int r = Math.min(mx - 1, i + k);
            int tot = ct[r] - (l > 0 ? ct[l - 1] : 0);
            int freq = ct[i] - (i > 0 ? ct[i - 1] : 0);
            ans = Math.max(ans, freq + Math.min(numOps, tot - freq));
        }
        return ans;
    }
}
