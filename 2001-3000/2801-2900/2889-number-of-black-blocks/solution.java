class Solution {
  public long[] countBlackBlocks(int m, int n, int[][] crdnts) {
    long[] ans = new long[5];
    Map<Long, Integer> mp = new HashMap<>();
    for (int[] crdnt : crdnts) {
      int x = crdnt[0];
      int y = crdnt[1];
      for (long i = x; i < x + 2; ++i)
        for (long j = y; j < y + 2; ++j)
          if (i - 1 >= 0 && i < m && j - 1 >= 0 && j < n)
            mp.merge(i * n + j, 1, Integer::sum);
    }

    for (int frq : mp.values())
      ans[frq]++;
    long sum = 0;
    for(long e : ans)
        sum += e;
    ans[0] = (m - 1L) * (n - 1) - sum;
    return ans;
  }
}
