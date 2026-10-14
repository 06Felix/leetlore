class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public String word;
}

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        for (String word : words)
            insert(word);
        int n = board.length;
        int m = board[0].length;
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                dfs(board, i, j, root, ans, n, m);

        return ans;
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
        node.word = word;
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, List<String> ans, int n, int m) {
        if (i < 0 || i == n || j < 0 || j == m || board[i][j] == '*')
            return;
        char c = board[i][j];
        TrieNode child = node.children[c - 'a'];
        if (child == null)
            return;
        if (child.word != null) {
            ans.add(child.word);
            child.word = null;
        }

        board[i][j] = '*';
        dfs(board, i + 1, j, child, ans, n, m);
        dfs(board, i - 1, j, child, ans, n, m);
        dfs(board, i, j + 1, child, ans, n, m);
        dfs(board, i, j - 1, child, ans, n, m);
        board[i][j] = c;
    }
}
