class Solution {
  public int maxValue(int[] nums, int k) {
    boolean[][][] left = getPossibleORs(nums, k);
    int[] reversedNums = reverseArray(nums);
    boolean[][][] right = getPossibleORs(reversedNums, k);
    reverseArray(right);

    int ans = 0;

    for (int i = k - 1; i + k < nums.length; ++i)
      for (int a = 0; a <= kMaxXor; ++a)
        for (int b = 0; b <= kMaxXor; ++b)
          if (left[i][k][a] && right[i + 1][k][b])
            ans = Math.max(ans, a ^ b);

    return ans;
  }
  private static int kMaxXor = 128;
  private boolean[][][] getPossibleORs(int[] nums, int k) {
    boolean[][][] dp = new boolean[nums.length][k + 1][kMaxXor + 1];
    dp[0][1][nums[0]] = true;
    for (int i = 0; i < nums.length; ++i)
      dp[i][0][0] = true;

    for (int i = 1; i < nums.length; ++i)
      for (int j = 1; j <= k; ++j)
        for (int x = 0; x <= kMaxXor; ++x) {
          if (dp[i - 1][j][x])
            dp[i][j][x] = true;
          if (dp[i - 1][j - 1][x])
            dp[i][j][nums[i] | x] = true;
        }

    return dp;
  }

  private int[] reverseArray(int[] arr) {
    int[] reversed = new int[arr.length];
    for (int i = 0; i < arr.length; ++i)
      reversed[i] = arr[arr.length - 1 - i];
    return reversed;
  }

  private void reverseArray(boolean[][][] arr) {
    for (int l = 0, r = arr.length - 1; l < r; ++l, --r) {
      boolean[][] temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;
    }
  }
}
