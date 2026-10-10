class Solution {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        long[] ans = new long[n];
        Integer[] ind = new Integer[n];
        for (int i = 0; i < n; i++)
            ind[i] = i;
        Arrays.sort(ind, (a, b) -> (nums1[a] - nums1[b]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long cur = 0;
        int curId = 0;
        for (int x : ind) {
            while (curId < n && nums1[ind[curId]] < nums1[x]) {
                int value = nums2[ind[curId]];
                if (pq.size() < k) {
                    pq.add(value);
                    cur += value;
                }
                else if (!pq.isEmpty() && value > pq.peek()) {
                    cur += value - pq.poll();
                    pq.add(value);
                }
                curId++;
            }
            ans[x] = cur;
        }
        return ans;
    }
}
