class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int c0 = 0, c1 = 0;
        for(int x : nums)
            if(x == 0){
                c0++;
                c1++;
            }
            else if(x == 1)
                c1++;
        for(int i = 0 ; i < n ; i++)
            if(i < c0)
                nums[i] = 0;
            else if(i < c1)
                nums[i] = 1;
            else
                nums[i] = 2;
    }
}
