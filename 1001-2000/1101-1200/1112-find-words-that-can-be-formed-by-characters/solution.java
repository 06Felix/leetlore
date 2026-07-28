class Solution {
  public int countCharacters(String[] words, String chars) {
    int ans = 0;
    int[] ct = new int[26];
    for (char c : chars.toCharArray())
      ++ct[c - 'a'];
    for (String word : words) {
      int[] tempct = ct.clone();
      for (char c : word.toCharArray())
        if (--tempct[c - 'a'] < 0) {
          ans -= word.length();
          break;
        }
      ans += word.length();
    }
    return ans;
  }
}
