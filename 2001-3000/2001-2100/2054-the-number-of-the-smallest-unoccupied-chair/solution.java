class Solution {
  public int smallestChair(int[][] times, int targetFriend) {
    int nxtChair = 0;
    Queue<Integer> avail = new PriorityQueue<>();
    Queue<Pair<Integer, Integer>> cur = new PriorityQueue<>((a, b) -> a.getKey() - b.getKey());
    for (int i = 0; i < times.length; ++i) {
      int[] time = times[i];
      time = Arrays.copyOf(time, time.length + 1);
      time[time.length - 1] = i;
      times[i] = time;
    }
    Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
    for (int[] time : times) {
      int st = time[0];
      int end = time[1];
      int i = time[2];
      while (!cur.isEmpty() && cur.peek().getKey() <= st)
        avail.add(cur.poll().getValue());
      if (i == targetFriend)
        return avail.isEmpty() ? nxtChair : avail.peek();
      if (avail.isEmpty())
        cur.add(new Pair<>(end, nxtChair++));
      else
        cur.add(new Pair<>(end, avail.poll()));
    }
    return 1193;
  }
}
