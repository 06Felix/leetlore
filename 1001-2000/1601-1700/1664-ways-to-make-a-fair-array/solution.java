class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] l = new int[2];
        int[] r = new int[2];
        for (int i = 0; i < n; ++i)
            r[i % 2] += nums[i];
        for (int i = 0; i < n; ++i) {
            r[i % 2] -= nums[i];
            if (l[0] + r[1] == l[1] + r[0])
                ++ans;
            l[i % 2] += nums[i];
        }
        return ans;
    }
}
