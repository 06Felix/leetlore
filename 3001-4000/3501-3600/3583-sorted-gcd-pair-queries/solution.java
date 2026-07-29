class Solution {
  public int[] gcdValues(int[] nums, long[] queries) {
    int mx = Arrays.stream(nums).max().getAsInt();
    int[] ans = new int[queries.length];
    int[] ctDiv = new int[mx + 1];
    long[] ctGP = new long[mx + 1];
    long[] pfctGP = new long[mx + 1];

    for (int num : nums)
      for (int i = 1; i * i <= num; ++i)
        if (num % i == 0) {
          ++ctDiv[i];
          if (i != num / i)
            ++ctDiv[num / i];
        }

    for (int gcd = mx; gcd >= 1; --gcd) {
      ctGP[gcd] = (long) ctDiv[gcd] * (ctDiv[gcd] - 1) / 2;
      for (int largerGcd = 2 * gcd; largerGcd <= mx; largerGcd += gcd)
        ctGP[gcd] -= ctGP[largerGcd];
    }
    for (int gcd = 1; gcd <= mx; ++gcd)
      pfctGP[gcd] = pfctGP[gcd - 1] + ctGP[gcd];
    for (int i = 0; i < queries.length; ++i)
      ans[i] = findN(queries[i], pfctGP);
    return ans;
  }

  private int findN(long q, long[] pfctGP) {
    int l = 1;
    int r = pfctGP.length - 1;
    while (l < r) {
      int m = (l + r) / 2;
      if (pfctGP[m] < q + 1)
        l = m + 1;
      else
        r = m;
    }
    return l;
  }
}
