class Solution {
    public int maxSatisfaction(int[] sat) {
        int ans = 0, ss = 0;
        Arrays.sort(sat);
        for(int i = sat.length - 1 ; i >= 0 ; i--){
            ss += sat[i];
            if(ss <= 0)
                return ans;
            ans += ss;
        }
        return ans;
    }
}
