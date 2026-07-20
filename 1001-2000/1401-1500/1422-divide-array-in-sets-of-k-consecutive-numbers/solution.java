class Solution {
  public boolean isPossibleDivide(int[] nums, int k) {
    TreeMap<Integer, Integer> count = new TreeMap<>();
    for (int num : nums)
      count.merge(num, 1, Integer::sum);
    for (int start : count.keySet()) {
      int value = count.getOrDefault(start, 0);
      if (value > 0)
        for (int i = start; i < start + k; ++i)
          if (count.merge(i, -value, Integer::sum) < 0)
            return false;
    }

    return true;
  }
}
