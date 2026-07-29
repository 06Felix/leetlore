class Solution {
  public int unequalTriplets(int[] nums) {
    int ans = 0;
    int prev = 0;
    int next = nums.length;
    Map<Integer, Integer> m = new HashMap<>();
    for (int num : nums)
      m.merge(num, 1, Integer::sum);
    for (int freq : m.values()) {
      next -= freq;
      ans += prev * freq * next;
      prev += freq;
    }
    return ans;
  }
}
