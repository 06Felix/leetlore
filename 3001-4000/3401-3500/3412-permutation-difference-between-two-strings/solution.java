class Solution {
  public int findPermutationDifference(String s, String t) {
    int ans = 0;
    int[] pos = new int[26];
    for (int i = 0; i < s.length(); ++i)
      pos[s.charAt(i) - 'a'] = i;
    for (int i = 0; i < t.length(); ++i)
      ans += Math.abs(i - pos[t.charAt(i) - 'a']);
    return ans;
  }
}
