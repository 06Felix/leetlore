class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int inf = 1_000_000_000;
        int[] best = new int[n];
        int min = inf;
        int ans = inf;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; ++right) {
            sum += arr[right];

            while (sum > target)
                sum -= arr[left++];

            if (sum == target) {
                int len = right - left + 1;

                if (left > 0 && best[left - 1] < inf)
                    ans = Math.min(ans, len + best[left - 1]);

                min = Math.min(min, len);
            }

            best[right] = min;
        }

        return ans == inf ? -1 : ans;
    }
}
