class Solution {
    private static int mod = 1_000_000_007;
    public int countTrapezoids(int[][] points) {
        Map<Integer, Long> m = new HashMap<>();
        for (int[] row : points)
            m.put(row[1], m.getOrDefault(row[1], 0L) + 1);
        List<Long> height = new ArrayList<>();
        for (long val : m.values())
            if (val >= 2) {
                long ways = (val * (val - 1)) / 2;
                height.add(ways % mod);
            }
        long ans = 0, sum = 0;
        for (long val : height) {
            ans = (ans + (val * sum) % mod) % mod;
            sum = (sum + val) % mod;
        }
        return (int) ans;
    }
}
