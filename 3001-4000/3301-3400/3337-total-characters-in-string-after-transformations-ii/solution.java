class Solution {
    private int mod = 1_000_000_007;
    private int[][] T(List<Integer> nums) {
        int[][] T = new int[26][26];
        for (int i = 0; i < nums.size(); ++i)
            for (int j = 1; j <= nums.get(i); ++j)
                ++T[i][(i + j) % 26];
        return T;
    }
    private int[][] I(int sz) {
        int[][] I = new int[sz][sz];
        for (int i = 0; i < sz; ++i)
            I[i][i] = 1;
        return I;
    }
    private int[][] mul(int[][] A, int[][] B) {
        int sz = A.length;
        int[][] C = new int[sz][sz];
        for (int i = 0; i < sz; ++i)
            for (int j = 0; j < sz; ++j)
                for (int k = 0; k < sz; ++k)
                C[i][j] = (int) ((C[i][j] + (long) A[i][k] * B[k][j]) % mod);
        return C;
    }
    private int[][] pow(int[][] M, int n) {
        if (n == 0)
            return I(M.length);
        if (n % 2 == 1)
            return mul(M, pow(M, n - 1));
        return pow(mul(M, M), n / 2);
    }
  public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        int[][] T = T(nums);
        int[][] pT = pow(T, t);
        int[] ct = new int[26];
        long[] ln = new long[26];
        for (char c : s.toCharArray())
            ++ct[c - 'a'];
        for (int i = 0; i < 26; ++i)
            for (int j = 0; j < 26; ++j) {
                ln[j] += (long) ct[i] * pT[i][j];
                ln[j] %= mod;
            }
        long ans = 0;
        for(long x : ln)
            ans = (ans + x) % mod;
        return (int) ans;
    }
}
