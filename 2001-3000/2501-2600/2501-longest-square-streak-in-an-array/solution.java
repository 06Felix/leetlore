public class Solution {
    public int longestSquareStreak(int[] nums) {
        int ans = -1;
        boolean[] exist = new boolean[100001];
        boolean[] vis = new boolean[100001];
        for (int num : nums)
            exist[num] = true;
        int tl = 1;
        for (int i = 2; i * i <= 100000; i++) {
            if (!exist[i] || vis[i])
                continue;
            vis[i] = true;
            int j = i * i;
            while (j >= 0 && j <= 100000 && exist[j]) {
                vis[j] = true;
                tl++;
                j = j * j;
            }
            if (tl > 1)
                ans = Math.max(ans, tl);
            tl = 1;
        }
        return ans;
    }
}
