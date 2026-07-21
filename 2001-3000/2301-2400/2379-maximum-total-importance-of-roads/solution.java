class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long ans = 0;
        long[] ct = new long[n];
        for(int[] r : roads){
            ct[r[0]]++;
            ct[r[1]]++;
        }
        Arrays.sort(ct);
        for(int i = 0 ; i < n ; i++)
            ans += (i + 1) * ct[i];
        return ans;
    }
}
