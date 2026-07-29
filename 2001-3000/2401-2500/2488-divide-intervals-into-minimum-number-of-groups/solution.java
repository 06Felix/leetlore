class Solution {
    public int minGroups(int[][] intervals) {
        int ans = 0, cur = 0;
        int[] ct = new int[1000002];
        for(int[] it : intervals){
            ct[it[0]]++;
            ct[it[1] + 1]--;
        }
        for(int x : ct){
            cur += x;
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
