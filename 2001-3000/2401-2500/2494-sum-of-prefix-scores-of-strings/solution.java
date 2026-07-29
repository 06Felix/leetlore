class TrieNode{
    TrieNode[] child = new TrieNode[26];
    int ct = 0;
}
class Solution {
    private TrieNode root = new TrieNode();
    private void insert(String word){
        TrieNode t = root;
        for(char ch : word.toCharArray()){
            if(t.child[ch - 'a'] == null)
                t.child[ch - 'a'] = new TrieNode();
            t = t.child[ch - 'a'];
            t.ct++;
        }
    }
    private int find(String str){
        int ans = 0;
        TrieNode t = root;
        for(char ch : str.toCharArray()){
            if(t.child[ch - 'a'] == null)
                break;
            t = t.child[ch - 'a'];
            ans += t.ct;
        }
        return ans;
    }
    public int[] sumPrefixScores(String[] words) {
        int[] ans = new int[words.length];
        for(String word : words)
            insert(word);
        int id = 0;
        for(String word : words)
            ans[id++] = find(word);
        return ans;
    }
}
