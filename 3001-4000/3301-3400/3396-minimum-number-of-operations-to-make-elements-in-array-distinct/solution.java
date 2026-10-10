class Solution {
    public int minimumOperations(int[] nums) {
        int[] ct = new int[101];
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            if(++ct[nums[i]] != 1)
                return (i + 3) / 3;
        }
        return 0;
    }
}
