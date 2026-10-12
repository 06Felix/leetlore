class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length, k = n / 3;
        long[] ltMin = new long[n];
        long[] rtMax = new long[n];
        long lSum = 0, rSum = 0, ans = Long.MAX_VALUE;
        PriorityQueue<Integer> maxQ = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            maxQ.offer(nums[i]);
            lSum += nums[i];
        }
        ltMin[k - 1] = lSum;
        for (int i = k; i < n - k; i++) {
            int x = nums[i];
            if (x < maxQ.peek()) {
                lSum += x - maxQ.poll();
                maxQ.offer(x);
            }
            ltMin[i] = lSum;
        }
        for (int i = n - 1; i >= n - k; i--) {
            minQ.offer(nums[i]);
            rSum += nums[i];
        }
        rtMax[n - k] = rSum;
        for (int i = n - k - 1; i >= k - 1; i--) {
            int x = nums[i];
            if (x > minQ.peek()) {
                rSum += x - minQ.poll();
                minQ.offer(x);
            }
            rtMax[i] = rSum;
        }
        for (int i = k - 1; i < n - k; i++)
            ans = Math.min(ans, ltMin[i] - rtMax[i + 1]);
        return ans;
    }
}
