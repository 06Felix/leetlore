class UF{
    int[] id = new int[26];
    UF(){
        for(int i = 0 ; i < 26 ; i++)
            id[i] = i;
    }
    void union(int u, int v){
        int i = find(u);
        int j = find(v);
        id[i] = j;
    }
    int find(int u){
        return id[u] == u ? u : (id[u] = find(id[u]));
    }
}
class Solution {
    public boolean equationsPossible(String[] arr) {
        int n = arr.length;
        UF uf = new UF();
        for(int i = 0 ; i < n ; i++)
            if(arr[i].charAt(1) == '=')
                uf.union(arr[i].charAt(0) - 'a', arr[i].charAt(3) - 'a');
        for(int i = 0 ; i < n ; i++)
            if(arr[i].charAt(1) == '!' && uf.find(arr[i].charAt(0) - 'a') == uf.find(arr[i].charAt(3) - 'a'))
                return false;
        return true;
    }
}
