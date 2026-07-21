class Solution {
  public int minIncrementForUnique(int[] nums) {
    int ans = 0;
    int mA = 0;
    Arrays.sort(nums);
    for (int num : nums) {
      ans += Math.max(mA - num, 0);
      mA = Math.max(mA, num) + 1;
    }
    return ans;
  }
}
