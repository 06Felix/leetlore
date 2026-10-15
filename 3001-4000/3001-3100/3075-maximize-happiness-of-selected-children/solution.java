class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        Arrays.sort(hap);
        int i = hap.length - 1;
        int j = i;
        int ct = 0;
        while(i >= 0){
            hap[i] -= ct;
            ct++;
            i--;
        }
        long ans = 0;
        while(k-- > 0 && j >= 0){
            if(hap[j] > 0)
                ans += hap[j];
            j--;
        }
        return ans;
    }
}
