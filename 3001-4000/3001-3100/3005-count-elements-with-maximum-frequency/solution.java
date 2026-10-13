class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] fr = new int[101];
        int ans = 0,cur = 0;
        for(int x : nums){
            int ct = ++fr[x];
            if(ct > cur){
                ans = ct;
                cur = ct;
                continue;
            }
            else if(ct == cur)
                ans += ct;
        }
        return ans;
    }
}
