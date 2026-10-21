class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int i = 0; i < n; ++i)
            m.put(intervals[i][0], i);
        for (int i = 0; i < n; ++i) {
            Map.Entry<Integer, Integer> entry = m.ceilingEntry(intervals[i][1]);
            ans[i] = entry == null ? -1 : entry.getValue();
        }
        return ans;
    }
}
