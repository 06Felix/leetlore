class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] ct = new int[k];
        ct[0] = 1;
        int ans = 0, cur = 0;
        for(int num : nums){
            cur = (cur + num % k + k) % k;
            ans += ct[cur];
            ct[cur]++;
        }
        return ans;
    }
}
