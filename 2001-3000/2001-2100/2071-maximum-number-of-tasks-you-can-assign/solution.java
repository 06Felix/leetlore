class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        int ans = 0;
        int l = 0;
        int r = Math.min(tasks.length, workers.length);
        Arrays.sort(tasks);
        Arrays.sort(workers);
        while (l <= r) {
            int m = (l + r) / 2;
            if (find(tasks, workers, pills, strength, m)) {
                ans = m;
                l = m + 1;
            }
            else
                r = m - 1;
        }
        return ans;
    }
    private boolean find(int[] tasks, int[] workers, int pillsLeft, int strength, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = workers.length - k; i < workers.length; i++)
            map.merge(workers[i], 1, Integer::sum);
        for (int i = k - 1; i >= 0; i--) {
            Integer lo = map.ceilingKey(tasks[i]);
            if (lo != null) {
                map.merge(lo, -1, Integer::sum);
                if (map.get(lo) == 0)
                    map.remove(lo);
            }
            else if (pillsLeft > 0) {
                lo = map.ceilingKey(tasks[i] - strength);
                if (lo != null) {
                    map.merge(lo, -1, Integer::sum);
                    if (map.get(lo) == 0)
                        map.remove(lo);
                    --pillsLeft;
                }
                else
                    return false;
            }
            else
                return false;
        }
        return true;
    }
}
