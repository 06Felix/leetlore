class Solution {
  public int longestSubstring(String s, int k) {
    int ans = 0;
    for (int n = 1; n <= 26; ++n)
      ans = Math.max(ans, find(s, k, n));
    return ans;
  }

  private int find(String s, int k, int n) {
    int res = 0;
    int unq = 0;
    int kFreq = 0;
    int[] ct = new int[26];

    for (int l = 0, r = 0; r < s.length(); ++r) {
      if (++ct[s.charAt(r) - 'a'] == 1)
        ++unq;
      if (ct[s.charAt(r) - 'a'] == k)
        ++kFreq;
      while (unq > n) {
        if (ct[s.charAt(l) - 'a'] == k)
          --kFreq;
        if (--ct[s.charAt(l) - 'a'] == 0)
          --unq;
        ++l;
      }
      if (kFreq == n)
        res = Math.max(res, r - l + 1);
    }

    return res;
  }
}
