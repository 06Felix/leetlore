class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        for(int n : nums)
            pq.offer(n);
        while(k-- > 0)
            pq.offer(-pq.poll());
        int ans = 0;
        while(!pq.isEmpty())
            ans += pq.poll();
        return ans;
    }
}
