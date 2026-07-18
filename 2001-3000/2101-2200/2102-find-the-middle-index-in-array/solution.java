class Solution {
    public int findMiddleIndex(int[] nums) {
        int tsum = 0;
        int rsum = 0;
        for(int n : nums)
            tsum += n;
        for(int i = 0 ; i < nums.length ; i++){
            tsum -= nums[i];
            if(i > 0)
                rsum += nums[i - 1];
            if(tsum == rsum)
                return i;
        }
        return -1;
    }
}
