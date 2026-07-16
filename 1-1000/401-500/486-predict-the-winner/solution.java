class Solution {
    public boolean predictTheWinner(int[] nums) {
        return maxP1(nums,0,nums.length - 1) >= 0;
    }
    private int maxP1(int[] nums,int l,int r){
        if(l == r)
            return nums[l];
        return Math.max(nums[l] - maxP1(nums,l+1,r),nums[r] - maxP1(nums,l,r-1));
    }
}
