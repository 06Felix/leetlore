class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        int p_max = Integer.MIN_VALUE;
        int p_min = Integer.MAX_VALUE;
        int i = 0;
        while(i < n){
            int cur_max = nums[i];
            int cur_min = nums[i];
            int curSet = Integer.bitCount(nums[i]);
            int j = i + 1;
            while(j < n && Integer.bitCount(nums[j]) == curSet){
                cur_max = Math.max(cur_max, nums[j]);
                cur_min = Math.min(cur_min, nums[j]);
                j++;
            }
            if(cur_min < p_max)
                return false;
            p_max = cur_max;
            p_min = cur_min;
            i = j;
        }
        return true;
    }
}
