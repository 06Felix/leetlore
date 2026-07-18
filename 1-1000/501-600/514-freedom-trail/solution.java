class Solution {
  public int findRotateSteps(String ring, String key) {
    Map<String, Integer> mem = new HashMap<>();
    return dfs(ring, key, 0, mem) + key.length();
  }

  private int dfs(String ring, String key, int index, Map<String, Integer> mem) {
    if (index == key.length())
      return 0;
    String hash = ring + String.valueOf(index);
    if (mem.containsKey(hash))
      return mem.get(hash);

    int ans = Integer.MAX_VALUE;

    for (int i = 0; i < ring.length(); ++i)
      if (ring.charAt(i) == key.charAt(index)) {
        int minRt = Math.min(i, ring.length() - i);
        String newRg = ring.substring(i) + ring.substring(0, i);
        int remRt = dfs(newRg, key, index + 1, mem);
        ans = Math.min(ans, minRt + remRt);
      }

    mem.put(hash, ans);
    return ans;
  }
}
