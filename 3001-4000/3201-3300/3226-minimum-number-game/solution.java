class Solution {
    public int[] numberGame(int[] nums) {
        int i = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        for(int n : nums)
            pq.offer(n);
        int[] ans = new int[nums.length];
        while(!pq.isEmpty()){
            int a = pq.poll();
            ans[i++] = pq.poll();
            ans[i++] = a;
        }
        return ans;
    }
}
