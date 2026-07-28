class Solution {
  public int expressiveWords(String s, String[] words) {
    int ans = 0;
    for (String word : words)
      if (check(s, word))
        ++ans;
    return ans;
  }
  private boolean check(String s, String word) {
    int n = s.length();
    int m = word.length();
    int j = 0;
    for (int i = 0; i < n; ++i)
      if (j < m && s.charAt(i) == word.charAt(j))
        ++j;
      else if (i > 1 && s.charAt(i) == s.charAt(i - 1) && s.charAt(i - 1) == s.charAt(i - 2))
        continue;
      else if (0 < i && i + 1 < n && s.charAt(i - 1) == s.charAt(i) &&
               s.charAt(i) == s.charAt(i + 1))
        continue;
      else
        return false;
    return j == m;
  }
}
