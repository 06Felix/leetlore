class Solution {
  public int sumOfPower(int[] nums, int k) {
    Integer[][] mem = new Integer[nums.length][k + 1];
    return sumOfPower(nums, 0, k, mem);
  }

  private int kMod = 1_000_000_007;

  private int sumOfPower(int[] nums, int i, int j, Integer[][] mem) {
    if (j == 0)
      return (int) modPow(2, nums.length - i);
    if (i == nums.length || j < 0)
      return 0;
    if (mem[i][j] != null)
      return mem[i][j];
    mem[i][j] = (int) ((sumOfPower(nums, i + 1, j - nums[i], mem) + 2L * sumOfPower(nums, i + 1, j, mem)) % kMod);
    return mem[i][j];
  }

  private long modPow(long x, long n) {
    if (n == 0)
      return 1;
    if (n % 2 == 1)
      return x * modPow(x % kMod, (n - 1)) % kMod;
    return modPow(x * x % kMod, (n / 2)) % kMod;
  }
}
