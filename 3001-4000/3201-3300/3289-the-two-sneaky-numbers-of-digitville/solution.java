class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ct = new int[nums.length];
        int[] ans = new int[2];
        int id = 0;
        for(int n : nums){
            ct[n]++;
            if(ct[n] > 1)
                ans[id++] = n;
        }
        return ans;
    }
}
