class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public boolean isWord = false;
}

class MagicDictionary {
    public void buildDict(String[] dict) {
        for (String word : dict)
            insert(word);
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); ++i) {
            int id = word.charAt(i) - 'a';
            for (int j = 0; j < 26; ++j) {
                if (j == id)
                    continue;
                TrieNode child = node.children[j];
                if (child == null)
                    continue;
                if (find(child, word, i + 1))
                    return true;
            }
            if (node.children[id] == null)
                return false;
            node = node.children[id];
        }
        return false;
    }

    private TrieNode root = new TrieNode();

    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
        int i = c - 'a';
        if (node.children[i] == null)
            node.children[i] = new TrieNode();
        node = node.children[i];
        }
        node.isWord = true;
    }

    private boolean find(TrieNode node, String word, int s) {
        for (int i = s; i < word.length(); ++i) {
            int id = word.charAt(i) - 'a';
            if (node.children[id] == null)
                return false;
            node = node.children[id];
        }
        return node.isWord;
    }
}
