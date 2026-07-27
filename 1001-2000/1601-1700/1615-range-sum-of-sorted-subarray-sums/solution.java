import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.value));
        for (int i = 0; i < n; i++) 
            pq.offer(new Pair(nums[i], i));

        int ans = 0, mod = (int) (1e9 + 7);
        for (int i = 1; i <= right; i++) {
            Pair p = pq.poll();
            if (i >= left) 
                ans = (ans + p.value) % mod;
            if (p.index < n - 1) {
                p.value += nums[++p.index];
                pq.offer(p);
            }
        }
        return ans;
    }

    private static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
