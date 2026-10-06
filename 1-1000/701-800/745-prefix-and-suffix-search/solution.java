class TrieNode {
    public TrieNode[] children = new TrieNode[27];
    public int index;
}
class WordFilter {
    private TrieNode root = new TrieNode();
    private void insert(String word, int id) {
        TrieNode node = root;
        for (char c : word.toCharArray()){
            int i = c - 'a';
            if (node.children[i] == null)
                node.children[i] = new TrieNode();
            node = node.children[i];
            node.index = id;
        }
    }
    public int search(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()) {
            if(cur.children[c - 'a'] == null)
                return -1;
            cur = cur.children[c - 'a'];
        }
        return cur.index;
    }
    public WordFilter(String[] words) {
        int m = words.length;
        for(int j = 0 ; j < m ; j++){
            String word = words[j];
            int n = word.length();
            for(int i = 0 ; i < n ; i++)
                insert(word.substring(i) + "{" + word, j);
        }
    }
    
    public int f(String pref, String suff) {
        return search(suff + "{" + pref);
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */
