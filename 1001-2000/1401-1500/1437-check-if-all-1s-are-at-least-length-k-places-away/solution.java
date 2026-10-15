class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prv = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                if(prv != -1 && i - prv - 1 < k)
                    return false;
                prv = i;
            }
        }
        return true;
    }
}
