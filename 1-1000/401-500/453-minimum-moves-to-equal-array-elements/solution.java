class Solution {
    public int minMoves(int[] nums) {
        int sum = 0, mn = Integer.MAX_VALUE;
        for(int x : nums){
            sum += x;
            mn = Math.min(mn, x);
        }
        return sum - mn * nums.length;
    }
}
