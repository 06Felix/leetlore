class Solution {
    public int[] getFinalState(int[] nums, int k, int mul) {
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
            pq.offer(new int[]{nums[i], i});
        while(k-- > 0){
            int[] cur = pq.poll();
            cur[0] *= mul;
            nums[cur[1]] *= mul;
            pq.offer(cur);
        }
        return nums;
    }
}
