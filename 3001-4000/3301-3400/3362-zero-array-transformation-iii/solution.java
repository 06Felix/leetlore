class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        int id = 0;
        Queue<Integer> q1 = new PriorityQueue<>((a, b) -> b - a);
        Queue<Integer> q2 = new PriorityQueue<>();
        Arrays.sort(queries, (a1, a2) -> a1[0] - a2[0]);
        for (int i = 0; i < nums.length; ++i) {
            while (id < queries.length && queries[id][0] <= i)
                q1.offer(queries[id++][1]);
            while (!q2.isEmpty() && q2.peek() < i)
                q2.poll();
            while (nums[i] > q2.size()) {
                if (q1.isEmpty() || q1.peek() < i)
                    return -1;
                q2.offer(q1.poll());
            }
        }
        return q1.size();
    }
}
