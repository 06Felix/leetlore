class UF{
    int[] id;
    UF(int n){
        id = new int[n];
        for(int i = 0 ; i < n ; i++)
            id[i] = i;
    }
    int find(int u){
        return id[u] == u ? u : (id[u] = find(id[u]));
    }
    void union(int a, int b){
        id[find(a)] = find(b);
    }
}
class Solution {
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        int l = strs[0].length();
        UF uf = new UF(n);
        for(int i = 0 ; i < n ; i++)
            for(int j = i + 1 ; j < n ; j++)
                if(check(strs[i], strs[j], l))
                    uf.union(i, j);
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
            if(uf.find(i) == i)
                ans++;
        return ans;
    }
    private boolean check(String s1, String s2, int n){
        boolean done = false;
        char a = '1', b = '2';
        for(int i = 0 ; i < n ; i++){
            char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if(c1 != c2){
                if(done)
                    return false;
                if(a == '1'){
                    b = c1;
                    a = c2;
                }
                else{
                    if(c1 != a || c2 != b)
                        return false;
                    done = true;
                }
            }
        }
        return done || a == '1';
    }
}
