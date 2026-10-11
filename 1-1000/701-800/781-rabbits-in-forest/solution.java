class Solution {
    public int numRabbits(int[] answers) {
        int ans = 0;
        int[] ct = new int[1000];
        for (int x : answers) {
            if (ct[x] % (x + 1) == 0)
                ans += x + 1;
            ct[x]++;
        }
        return ans;
    }
}
