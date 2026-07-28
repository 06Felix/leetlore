class Solution {
  public List<String> findAllConcatenatedWordsInADict(String[] words) {
    List<String> ans = new ArrayList<>();
    Set<String> wordSet = new HashSet<>(Arrays.asList(words));
    Map<String, Boolean> mem = new HashMap<>();

    for (String word : words)
      if (wordBreak(word, wordSet, mem))
        ans.add(word);

    return ans;
  }

  private boolean wordBreak(String word, Set<String> wordSet, Map<String, Boolean> mem) {
    if (mem.containsKey(word))
      return mem.get(word);

    for (int i = 1; i < word.length(); ++i) {
      String prefix = word.substring(0, i);
      String suffix = word.substring(i);
      if (wordSet.contains(prefix) &&
          (wordSet.contains(suffix) || wordBreak(suffix, wordSet, mem))) {
        mem.put(word, true);
        return true;
      }
    }

    mem.put(word, false);
    return false;
  }
}
