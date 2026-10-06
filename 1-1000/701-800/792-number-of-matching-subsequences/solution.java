class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public int isWord = 0;
}

class Solution {
    private TrieNode root = new TrieNode();
    public int numMatchingSubseq(String s, String[] words) {
        for (String word : words)
            insert(word);
        return dfs(s, 0, root);
    }
    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.children[i] == null)
                node.children[i] = new TrieNode();
            node = node.children[i];
        }
        node.isWord++;
    }
    private int dfs(String s, int i, TrieNode node) {
        int ans = node.isWord;
        if (i >= s.length())
            return ans;
        for (int j = 0; j < 26; ++j)
            if (node.children[j] != null) {
                int index = s.indexOf('a' + j, i);
                if (index >= 0)
                    ans += dfs(s, index + 1, node.children[j]);
            }
        return ans;
    }
}
