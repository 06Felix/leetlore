class Solution {
  public long taskSchedulerII(int[] tasks, int space) {
    Map<Integer, Long> m = new HashMap<>();
    long ans = 0;
    for (int task : tasks) {
      ans = Math.max(ans + 1, m.getOrDefault(task, 0L));
      m.put(task, ans + space + 1);
    }

    return ans;
  }
}
