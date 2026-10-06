class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        List<String>[] freq = new List[n + 1];
        Map<String, Integer> m = new HashMap<>();
        for (String word : words)
            m.merge(word, 1, Integer::sum);
        for (String word : m.keySet()) {
            int ct = m.get(word);
            if (freq[ct] == null)
                freq[ct] = new ArrayList<>();
            freq[ct].add(word);
        }
        List<String> ans = new ArrayList<>();
        for (int ct = n ; ct > 0 ; ct--)
            if (freq[ct] != null) {
                Collections.sort(freq[ct]);
                for (String word : freq[ct]) {
                    ans.add(word);
                    if (ans.size() == k)
                        return ans;
                }
            }
        return new ArrayList<>();
    }
}
