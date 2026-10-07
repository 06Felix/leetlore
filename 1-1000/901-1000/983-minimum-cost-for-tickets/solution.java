class Solution {
  public int mincostTickets(int[] days, int[] costs) {
    int ans = 0;
    Queue<int[]> l7 = new ArrayDeque<>();
    Queue<int[]> l30 = new ArrayDeque<>();
    for (int day : days) {
      while (!l7.isEmpty() && l7.peek()[0] + 7 <= day)
        l7.poll();
      while (!l30.isEmpty() && l30.peek()[0] + 30 <= day)
        l30.poll();
      l7.offer(new int[] {day, ans + costs[1]});
      l30.offer(new int[] {day, ans + costs[2]});
      ans = Math.min(ans + costs[0], Math.min(l7.peek()[1], l30.peek()[1]));
    }
    return ans;
  }
}
