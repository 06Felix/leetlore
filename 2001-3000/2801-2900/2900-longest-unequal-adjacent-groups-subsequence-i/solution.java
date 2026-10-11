class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        int id = -1;
        for (int i = 0; i < n; ++i)
            if (groups[i] != id) {
                id = groups[i];
                ans.add(words[i]);
            }

        return ans;
    }
}
