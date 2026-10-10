class Solution {
    private int mod = 1_000_000_007;
    public int numOfSubarrays(int[] arr) {
        int even = 1, odd = 0, sum = 0, ans = 0;
        for(int x : arr){
            sum ^= x;
            if((sum & 1) == 1){
                ans = (ans + even) % mod;
                odd++;
            }
            else{
                ans = (ans + odd) % mod;
                even++;
            }
        }
        return ans;
    }
}
