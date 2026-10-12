class TrieNode {
    TrieNode[] children;
    int[] level;
    TrieNode() {
        children = new TrieNode[58];
        level = new int[]{-1, -1, -1};
    }
}
class Trie {
    TrieNode root;
    Trie() {
        this.root = new TrieNode();
    }
    void insert(String word, int idx, int level) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int i = ch - 'A';
            if (node.children[i] == null)
                node.children[i] = new TrieNode();
            node = node.children[i];
        }
        node.level[level] = idx;
    }
    int search(String word, int level) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int i = ch - 'A';
            if (node.children[i] == null)
                return -1;
            node = node.children[i];
        }
        return node.level[level];
    }
}
class Solution {
    private Trie trie;
    private int vowelMask = (1 << ('a' & 31)) |
                            (1 << ('e' & 31)) |
                            (1 << ('i' & 31)) |
                            (1 << ('o' & 31)) |
                            (1 << ('u' & 31));
    private boolean isVowel(char ch) {
        return ((1 << (ch & 31)) & vowelMask) > 0;
    }
    private String mask(String word) {
        char[] str = word.toCharArray();
        int n = str.length;
        for (int i = 0; i < n; i++) 
            if (isVowel(str[i]))
                str[i] = '[';
        return new String(str);
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        this.trie = new Trie();
        int n = queries.length;
        int m = wordlist.length;
        String[] ans = new String[n];
        for (int i = m - 1; i >= 0; i--) {
            String word = wordlist[i];
            String wordLow = word.toLowerCase();
            trie.insert(word, i, 0);
            trie.insert(wordLow, i, 1);
            trie.insert(mask(wordLow), i, 2);
        }
        for (int i = 0; i < n; i++) {
            String query = queries[i];
            String queryLow = query.toLowerCase();
            int l0 = trie.search(query, 0);
            if (l0 >= 0){
                ans[i] = wordlist[l0];
                continue;
            }
            int l1 = trie.search(queryLow, 1);
            if (l1 >= 0) {
                ans[i] = wordlist[l1];
                continue;
            }
            int l2 = trie.search(mask(queryLow), 2);
            if (l2 >= 0) {
                ans[i] = wordlist[l2];
                continue;
            }
            ans[i] = "";
        }
        return ans;
    }
}
