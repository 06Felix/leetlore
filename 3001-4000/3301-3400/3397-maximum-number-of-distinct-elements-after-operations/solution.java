class Solution {
  public int maxDistinctElements(int[] nums, int k) {
        int ans = 0;
        int cur = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for (int num : nums)
            if (cur < num + k) {
                cur = Math.max(cur + 1, num - k);
                ans++;
            }
        return ans;
    }
}
