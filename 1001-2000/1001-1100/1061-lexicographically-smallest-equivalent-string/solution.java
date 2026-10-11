class UF{
    int[] id = new int[26];
    UF(){
        for(int i = 0 ; i < 26 ; i++)
            id[i] = i;
    }
    int find(int u){
        return id[u] == u ? u : (id[u] = find(id[u]));
    }
    void union(int a, int b){
        int i = find(a);
        int j = find(b);
        if(i < j)
            id[j] = i;
        else
            id[i] = j;
    }
}
class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n = s1.length();
        StringBuilder ans = new StringBuilder();
        UF uf = new UF();
        for(int i = 0 ; i < n ; i++)
            uf.union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        for(char ch : baseStr.toCharArray())
            ans.append((char)(uf.find(ch - 'a') + 'a'));
        return ans.toString();
    }
}
