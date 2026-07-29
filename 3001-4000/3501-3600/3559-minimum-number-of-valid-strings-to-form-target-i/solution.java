import java.util.*;

class TrieNode {
    TrieNode[] children;

    public TrieNode() {
        children = new TrieNode[26];
    }
}

class Trie {
    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                node.children[ch - 'a'] = new TrieNode();
            }
            node = node.children[ch - 'a'];
        }
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                return false;
            }
            node = node.children[ch - 'a'];
        }
        return true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                return false;
            }
            node = node.children[ch - 'a'];
        }
        return true;
    }
}

class Solution {
    public int minValidStrings(String[] words, String target) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        
        int n = target.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for (int i = 0; i < n; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue;
            }

            TrieNode node = trie.root;
            for (int j = i; j < n; j++) {
                char ch = target.charAt(j);
                if (node.children[ch - 'a'] == null) {
                    break;
                }
                node = node.children[ch - 'a'];
                dp[j + 1] = Math.min(dp[j + 1], dp[i] + 1);
            }
        }
        
        return dp[n] != Integer.MAX_VALUE ? dp[n] : -1;
    }
}
