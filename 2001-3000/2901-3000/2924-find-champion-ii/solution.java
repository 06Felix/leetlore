class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] ct = new int[n];
        for(int[] e : edges)
            ct[e[1]]++;
        int c = 0;
        int ans = -1;
        for(int i = 0 ; i < n ; i++)
            if(ct[i] == 0){
                ans = i;
                c++;
            }
        return c > 1 ? -1 : ans;
    }
}
