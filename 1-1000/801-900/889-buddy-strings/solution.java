class Solution {
  public boolean buddyStrings(String s, String goal) {
    if (s.length() != goal.length())
      return false;
    if (s.equals(goal) && hasDuplicateLetters(s))
      return true;

    List<Integer> l = new ArrayList<>();

    for (int i = 0; i < s.length(); ++i)
      if (s.charAt(i) != goal.charAt(i))
        l.add(i);

    return l.size() == 2 &&
        s.charAt(l.get(0)) == goal.charAt(l.get(1)) &&
        s.charAt(l.get(1)) == goal.charAt(l.get(0));
  }

  private boolean hasDuplicateLetters(String s) {
    int[] ct = new int[26];
    for (char c : s.toCharArray()){
      ++ct[c - 'a'];
      if(ct[c - 'a'] > 1)
        return true;
    }
    return false;
  }
}
