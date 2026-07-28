class Solution {
  public String truncateSentence(String s, int k) {
    String[] w = s.split(" ");
    String[] ans = new String[k];
    for (int i = 0; i < k; ++i)
      ans[i] = w[i];
    return String.join(" ", ans);
  }
}
