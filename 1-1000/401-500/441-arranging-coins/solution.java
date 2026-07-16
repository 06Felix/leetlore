class Solution {
  public int arrangeCoins(long n) {
    return (int) (Math.sqrt(8 * n + 1) - 1) / 2;
  }
}
