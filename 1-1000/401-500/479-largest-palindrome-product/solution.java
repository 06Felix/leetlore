class Solution {
  public int largestPalindrome(int n) {
    if (n == 1)
      return 9;

    int kMod = 1337;
    int upper = (int) Math.pow(10, n) - 1;
    int lower = (int) Math.pow(10, n - 1) - 1;

    for (int i = upper; i > lower; --i) {
      long cand = getPalindromeCandidate(i);
      for (long j = upper; j * j >= cand; --j)
        if (cand % j == 0)
          return (int) (cand % kMod);
    }
    return 1193;
  }

  private long getPalindromeCandidate(int i) {
    String reversed = new StringBuilder().append(i).reverse().toString();
    return Long.valueOf(i + reversed);
  }
}
