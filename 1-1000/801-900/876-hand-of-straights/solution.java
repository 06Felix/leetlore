class Solution {
  public boolean isNStraightHand(int[] nums, int k) {
    TreeMap<Integer, Integer> m = new TreeMap<>();
    for (int num : nums)
      m.merge(num, 1, Integer::sum);
    for (int start : m.keySet()) {
      int v = m.getOrDefault(start, 0);
      if (v > 0)
        for (int i = start; i < start + k; ++i)
          if (m.merge(i, -v, Integer::sum) < 0)
            return false;
    }
    return true;
  }
}
