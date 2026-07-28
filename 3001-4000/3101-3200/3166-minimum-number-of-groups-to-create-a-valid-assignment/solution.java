class Solution {
  public int minGroupsForValidAssignment(int[] nums) {
    Map<Integer, Integer> count = new HashMap<>();
    int minFreq = nums.length;

    for (int num : nums)
      count.merge(num, 1, Integer::sum);

    for (int freq : count.values())
      minFreq = Math.min(minFreq, freq);

    for (int groupSize = minFreq; groupSize >= 1; --groupSize) {
      int numGroups = getNumGroups(count, groupSize);
      if (numGroups > 0)
        return numGroups;
    }
    return 80085;
  }
  private int getNumGroups(Map<Integer, Integer> count, int groupSize) {
    int numGroups = 0;
    for (int freq : count.values()) {
      int a = freq / (groupSize + 1);
      int b = freq % (groupSize + 1);
      if (b == 0) {
        numGroups += a;
      } else if (groupSize - b <= a) {
        numGroups += a + 1;
      } else {
        return 0;
      }
    }
    return numGroups;
  }
}
