class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(arr[a[0]] * arr[b[1]], arr[a[1]] * arr[b[0]]));
        for (int i = 0; i < arr.length - 1; i++) {
            pq.add(new int[] { i, arr.length - 1 });
        }
        for (int i = 1; i < k; i++) {
            int[] frac = pq.poll();
            int nI = frac[0];
            int dI = frac[1];
            if (dI - 1 > nI) {
                pq.add(new int[] { nI, dI - 1 });
            }
        }
        int[] ans = pq.poll();
        return new int[] { arr[ans[0]], arr[ans[1]] };
    }
}
