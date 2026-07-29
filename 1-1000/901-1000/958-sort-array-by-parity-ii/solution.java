class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int ev = 0, od = 1;
        for(int x : nums)
            if(x % 2 == 0){
                ans[ev] = x;
                ev += 2;
            }
            else{
                ans[od] = x;
                od += 2;
            }
        return ans;
        
    }
}
