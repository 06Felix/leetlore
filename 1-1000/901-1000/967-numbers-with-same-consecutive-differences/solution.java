class Solution {
    private List<Integer> ans = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i = 1 ; i <= 9 ; i++)
            dfs(n, k, 1, i);
        int[] res = new int[ans.size()];
        int id = 0;
        for(int x : ans)
            res[id++] = x;
        return res;
    }
    private void dfs(int n, int k, int sz, int num){
        if(sz == n){
            ans.add(num);
            return;
        }
        int ld = num % 10;
        if(ld + k < 10)
            dfs(n, k, sz + 1, num * 10 + (ld + k));
        if(ld - k >= 0 && k != 0)
            dfs(n, k, sz + 1, num * 10 + (ld - k));
    }
}
