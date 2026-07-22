class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums)
            m.merge(n, 1, Integer::sum);
        Queue<Integer> q = new PriorityQueue<>((a, b) -> m.get(a) == m.get(b) ? b - a : m.get(a) - m.get(b));
        for(int n : m.keySet())
            q.offer(n);
        int i = 0;
        while(i < nums.length){
            int cur = q.poll();
            while(m.get(cur) > 0){
                nums[i++] = cur;
                m.merge(cur, -1, Integer::sum);
            }
        }
        return nums;
    }
}
