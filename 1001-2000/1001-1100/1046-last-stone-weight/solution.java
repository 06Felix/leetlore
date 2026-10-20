class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for(int x : stones)
            q.offer(x);
        while(q.size() > 1){
            int b = q.poll();
            int a = q.poll();
            if(b - a > 0)
                q.offer(b - a);
        }
        return q.isEmpty() ? 0 : q.poll();
    }
}
