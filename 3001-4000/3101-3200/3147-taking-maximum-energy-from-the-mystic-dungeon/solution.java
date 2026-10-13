class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int ans = Integer.MIN_VALUE;
        for (int i = n - k; i < n; i++)
            ans = Math.max(ans, energy[i]);
        for (int i = n - k - 1; i >= 0; i--) {
            energy[i] += energy[i + k];
            ans = Math.max(energy[i], ans);
        }
        return ans;
    }
}
