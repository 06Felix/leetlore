class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public boolean isWord = false;
}

class StreamChecker {
    private TrieNode root = new TrieNode();
    private StringBuilder letters = new StringBuilder();
    public StreamChecker(String[] words) {
        for (String word : words)
            insert(word);
    }

    public boolean query(char letter) {
        letters.append(letter);
        TrieNode node = root;
        for (int i = letters.length() - 1; i >= 0; --i) {
            int idx = letters.charAt(i) - 'a';
            if (node.children[idx] == null)
                return false;
            node = node.children[idx];
            if (node.isWord)
                return true;
        }
        return false;
    }


    private void insert(final String word) {
        TrieNode node = root;
        for (int i = word.length() - 1; i >= 0; --i) {
            int idx = word.charAt(i) - 'a';
            if (node.children[idx] == null)
                node.children[idx] = new TrieNode();
            node = node.children[idx];
        }
        node.isWord = true;
    }
}
