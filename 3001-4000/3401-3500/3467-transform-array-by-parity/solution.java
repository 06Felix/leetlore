class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int id = 0;
        for(int x : nums)
            if(x % 2 ==0)
                nums[id++] = 0;
        while(id < n)
            nums[id++] = 1;
        return nums;
    }
}
