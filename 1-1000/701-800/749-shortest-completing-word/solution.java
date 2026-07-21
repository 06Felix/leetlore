class Solution {
  public String shortestCompletingWord(String licensePlate, String[] words) {
    String ans = "****************";
    int[] count = new int[26];

    for (char c : licensePlate.toCharArray())
      if (Character.isLetter(c))
        ++count[Character.toLowerCase(c) - 'a'];

    for (String word : words)
      if (word.length() < ans.length() && isComplete(count, getCount(word)))
        ans = word;

    return ans;
  }

  private boolean isComplete(int[] c1, int[] c2) {
    for (int i = 0; i < 26; ++i)
      if (c1[i] > c2[i])
        return false;
    return true;
  }

  private int[] getCount(String word) {
    int[] count = new int[26];
    for (char c : word.toCharArray())
      ++count[c - 'a'];
    return count;
  }
}
