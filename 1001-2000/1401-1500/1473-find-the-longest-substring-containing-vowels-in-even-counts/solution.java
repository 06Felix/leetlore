class Solution {
  public int findTheLongestSubstring(String s) {
    String vls = "aeiou";
    int ans = 0;
    int prf = 0;
    Map<Integer, Integer> m = new HashMap<>();
    m.put(0, -1);

    for (int i = 0; i < s.length(); ++i) {
      int index = vls.indexOf(s.charAt(i));
      if (index != -1)
        prf ^= 1 << index;
      m.putIfAbsent(prf, i);
      ans = Math.max(ans, i - m.get(prf));
    }

    return ans;
  }
}
