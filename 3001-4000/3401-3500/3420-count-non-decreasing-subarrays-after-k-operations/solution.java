class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        long ans = 0;
        long cost = 0;
        ArrayDeque<long[]> deque = new ArrayDeque<>();

        for (int i = nums.length - 1, right = nums.length - 1; i >= 0; --i) {
            int val = nums[i];
            long count = 1;

            while (!deque.isEmpty() && deque.peekLast()[0] < val) {
                long[] last = deque.pollLast();
                count += last[1];
                cost += (long) (val - last[0]) * last[1];
            }

            deque.offerLast(new long[] {val, count});

            while (cost > k) {
                long[] first = deque.pollFirst();
                cost -= first[0] - nums[right];
                --right;

                if (first[1] > 1) {
                    --first[1];
                    deque.offerFirst(first);
                }
            }

            ans += right - i + 1;
        }

        return ans;
    }
}
