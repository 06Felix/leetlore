class Solution {
  public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    if (desiredTotal <= 0)
      return true;
    int sum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
    if (sum < desiredTotal)
      return false;
    if(maxChoosableInteger >= desiredTotal)
        return true;
    boolean[] st = new boolean[(1 << 21)];
    return canIWin(desiredTotal, 0, maxChoosableInteger, st);
  }
  private boolean canIWin(int total, int used, int maxChoosableInteger, boolean[] st) {
    if (total <= 0)
      return false;
    if (st[used])
      return false;
    for (int i = 1 ; i <= maxChoosableInteger; ++i) {
      if ((used >> i & 1) == 1)
        continue;
      if (!canIWin(total - i, used | 1 << i, maxChoosableInteger, st))
        return true;
    }
    st[used] = true;
    return false;
  }
}
