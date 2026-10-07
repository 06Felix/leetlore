class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];
        if (k == 0)
            return ans;
        int sum = 0;
        int l = k > 0 ? 1 : n + k;
        int r = k > 0 ? k : n - 1;
        for (int i = l; i <= r; ++i)
            sum += arr[i];
        for (int i = 0; i < n; ++i) {
            ans[i] = sum;
            sum -= arr[l++ % n];
            sum += arr[++r % n];
        }
        return ans;
    }
}
