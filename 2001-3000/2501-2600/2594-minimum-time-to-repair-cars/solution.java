class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l = 0;
        long r = Integer.MAX_VALUE;
        for(int x : ranks)
            r = Math.min(r, x);
        r = r * cars * cars;
        while (l < r) {
            long m = (l + r) / 2;
            if (find(ranks, m) >= cars)
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
    private long find(int[] arr, long m) {
        long ct = 0;
        for (int x : arr)
            ct += Math.sqrt(m / x);
        return ct;
    }
}
