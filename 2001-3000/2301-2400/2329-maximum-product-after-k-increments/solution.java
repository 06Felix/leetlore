class Solution {
    public int maximumProduct(int[] nums, int k) {
        long ans = 1;
        Queue<Integer> pq = new PriorityQueue<>();
        for(int n : nums)
            pq.offer(n);
        for(int i = 0 ; i < k ; i++){
            int cr = pq.poll();
            pq.offer(cr + 1);
        }
        while(!pq.isEmpty())
            ans = (ans * pq.poll()) % 1000000007;
        return (int)ans;
    }
}
