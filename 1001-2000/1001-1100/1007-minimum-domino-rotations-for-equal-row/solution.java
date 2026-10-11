class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int[] top = new int[7];
        int[] down = new int[7];
        int[] both = new int[7];
        for (int i = 0; i < n; ++i) {
            ++top[tops[i]];
            ++down[bottoms[i]];
            if (tops[i] == bottoms[i])
                ++both[tops[i]];
        }
        for (int i = 1; i <= 6; ++i)
            if (top[i] + down[i] - both[i] == n)
                return n - Math.max(top[i], down[i]);
        return -1;
    }
}
