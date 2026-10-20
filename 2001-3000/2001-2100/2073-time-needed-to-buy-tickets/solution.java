class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int x = t[k];
        int n = t.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            if(t[i] >= x){
                if(i <= k)
                    ans += x;
                else
                    ans += x - 1;
            }
            else
                ans += t[i];
        }
        return ans;
    }
}
