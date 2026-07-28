class Solution {
  public int maximumSum(int[] arr) {
    int kMin = Integer.MIN_VALUE / 2;
    int ans = kMin;
    int zero = kMin;
    int one = kMin;

    for (int a : arr) {
      one = Math.max(a, Math.max(one + a, zero));
      zero = Math.max(a, zero + a);
      ans = Math.max(ans, one);
    }

    return ans;
  }
}
