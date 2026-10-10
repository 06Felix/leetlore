class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        int max = 0;
        long sum = 0;
        long ops = (long) k1 + k2;

        for (int i = 0; i < n; ++i) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            sum += diff[i];
        }

        if (sum <= ops)
            return 0;

        int left = 0;
        int right = max;

        while (left < right) {
            int mid = (left + right) >>> 1;

            if (cost(diff, mid) <= ops)
                right = mid;
            else
                left = mid + 1;
        }

        int cap = left;
        long used = 0;

        for (int i = 0; i < n; ++i) {
            if (diff[i] > cap) {
                used += diff[i] - cap;
                diff[i] = cap;
            }
        }

        long rem = ops - used;

        for (int i = 0; i < n && rem > 0; ++i) {
            if (diff[i] == cap) {
                --diff[i];
                --rem;
            }
        }

        long ans = 0;

        for (int num : diff)
            ans += (long) num * num;

        return ans;
    }

    private long cost(int[] diff, int cap) {
        long ans = 0;

        for (int num : diff)
            if (num > cap)
                ans += num - cap;

        return ans;
    }
}
