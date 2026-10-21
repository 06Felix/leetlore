class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        double curSum = 0;
        for (int i = 0; i < k; ++i)
            curSum += arr[i];
        double average = curSum / k;
        int ans = 0;
        for (int i = k; i <= n; ++i) {
            if (average >= threshold)
                ++ans;
            if (i < n) {
                curSum -= arr[i - k];
                curSum += arr[i];
                average = curSum / k;
            }
        }
        return ans;
    }
}
