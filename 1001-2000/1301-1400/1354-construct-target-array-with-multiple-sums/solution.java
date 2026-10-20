class Solution {
    public boolean isPossible(int[] target) {
        if (target.length == 1)
            return target[0] == 1;
        long total = 0;
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int x : target) {
            total += x;
            pq.offer(x);
        }
        while (pq.peek() > 1) {
            long max = pq.poll();
            long restSum = total - max;
            if (restSum == 1)
                return true;
            long nextRequired = max % restSum;
            if (nextRequired == 0 || nextRequired == max)
                return false;
            pq.offer((int) nextRequired);
            total = total - max + nextRequired;
        }
        return true;
    }
}
