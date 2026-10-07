class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int[] pfx = new int[nums.length];
        int cur = 0;
        pfx[0] = cur;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] % 2 == nums[i - 1] % 2)
                cur++;
            pfx[i] = cur;
        }
        for (int i = 0; i < queries.length; ++i) {
            int l = queries[i][0];
            int r = queries[i][1];
            ans[i] = pfx[l] == pfx[r];
        }
        return ans;
    }
}
