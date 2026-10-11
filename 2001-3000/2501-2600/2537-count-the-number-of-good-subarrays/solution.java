class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        long ans = 0;
        int rc = 0;
        int n = nums.length;
        for(int l = 0, r = 0 ; r < n ; r++){
            int np = m.getOrDefault(nums[r], 0);
            rc += np;
            m.put(nums[r], np + 1);
            while(rc >= k){
                int npl = m.get(nums[l]);
                m.put(nums[l], npl - 1);
                l++;
                rc -= npl - 1;
            }
            ans += l;
        }
        return ans;
    }
}
