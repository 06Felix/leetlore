class Solution {
  public int minimumAddedInteger(int[] nums1, int[] nums2) {
    int ans = Integer.MAX_VALUE;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    for (int i = 0; i < 3; ++i) {
      int inc = nums2[0] - nums1[i];
      if (isValidDiff(nums1, nums2, inc))
        ans = Math.min(ans, inc);
    }

    return ans;
  }
  private boolean isValidDiff(int[] nums1, int[] nums2, int inc) {
    int removed = 0;
    int i = 0;

    for (int num : nums1)
      if (num + inc == nums2[i]) {
        if (++i == nums2.length)
          break;
      } else {
        ++removed;
      }
    return removed <= 2;
  }
}
