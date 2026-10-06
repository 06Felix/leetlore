class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        record T(int i, int j, int val) {}
        Queue<T> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); ++i) {
            int val = nums.get(i).get(0);
            pq.offer(new T(i, 0, val));
            mn = Math.min(mn, val);
            mx = Math.max(mx, val);
        }
        int l = mn;
        int r = mx;
        while (pq.size() == nums.size()) {
            int i = pq.peek().i;
            int j = pq.poll().j;
            if (j + 1 < nums.get(i).size()) {
                pq.offer(new T(i, j + 1, nums.get(i).get(j + 1)));
                mx = Math.max(mx, nums.get(i).get(j + 1));
                mn = pq.peek().val;
            }
            if (mx - mn < r - l) {
                l = mn;
                r = mx;
            }
        }
        return new int[] {l, r};
    }
}
