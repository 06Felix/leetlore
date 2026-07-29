class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] stp = new boolean[60 * 24];
        int st = 60 * 24, ans = 60 * 24;
        for(String str : timePoints){
            int tm = Integer.parseInt(str.substring(0, 2)) * 60 + Integer.parseInt(str.substring(3));
            if(stp[tm])
                return 0;
            st = Math.min(st, tm);
            stp[tm] = true;
        }
        int cur = st;
        for(int i = st + 1 ; i < 60 * 24 ; i++){
            if(stp[i]){
                ans = Math.min(ans, i - cur);
                cur = i;
            }
        }
        return Math.min(ans, 60 * 24 - cur + st);
    }
}
