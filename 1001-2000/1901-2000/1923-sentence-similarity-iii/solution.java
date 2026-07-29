class Solution {
  public boolean areSentencesSimilar(String s1, String s2) {
    if (s1.length() == s2.length())
      return s1.equals(s2);
    String[] w1 = s1.split(" ");
    String[] w2 = s2.split(" ");
    int m = w1.length;
    int n = w2.length;
    if (m > n)
      return areSentencesSimilar(s2, s1);
    int i = 0;
    while (i < m && w1[i].equals(w2[i]))
      ++i;
    while (i < m && w1[i].equals(w2[i + n - m]))
      ++i;
    return i == m;
  }
}
