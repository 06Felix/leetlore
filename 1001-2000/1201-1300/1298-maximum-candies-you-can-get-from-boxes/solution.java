class Solution {
    public int maxCandies(int[] vis, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        boolean seen = true;
        int ans = 0;
        List<Integer> l = new ArrayList<>();
        for (int x : initialBoxes)
            l.add(x);
        while (!l.isEmpty() && seen) {
            seen = false;
            List<Integer> t = new ArrayList<>();
            for (int id : l) {
                if (vis[id] == 1) {
                    seen = true;
                    for (int k : containedBoxes[id])
                        t.add(k);
                    for (int keyId : keys[id])
                        vis[keyId] = 1;
                    ans += candies[id];
                }
                else
                    t.add(id);
            }
            l = t;
        }
        return ans;
    }
}
