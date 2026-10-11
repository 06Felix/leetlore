class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int x : nums)
            if (9 < x && x < 100 || 999 < x && x < 10000 || x == 100000)
                ans++;
        return ans;
    }
}
