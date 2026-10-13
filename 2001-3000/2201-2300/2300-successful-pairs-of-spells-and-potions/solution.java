class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; ++i)
            ans[i] = m - find(spells[i], potions, success, m);
        return ans;
    }

    private int find(int spell, int[] potions, long success, int n) {
        int l = 0;
        int r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if (1L * spell * potions[m] >= success)
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
}
