class Solution {
  public int findPoisonedDuration(int[] ts, int dr) {
    if (dr == 0)
      return 0;
    int ans = 0;
    for (int i = 0; i + 1 < ts.length; i++)
      ans += Math.min(ts[i + 1] - ts[i], dr);

    return ans + dr;
  }
}
