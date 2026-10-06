class Solution {
    public long maxKelements(int[] nums, int k) {
        long ans = 0;
        Queue<Double> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : nums)
            q.offer(x * 1.0);
        while(k-- > 0){
            double cur = q.poll();
            ans += (long)cur;
            q.offer(Math.ceil(cur / 3));
        }
        return ans;
    }
}
