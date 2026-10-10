class Solution {
    public int maximumCount(int[] nums) {
        int pc = 0, nc = 0;
        for(int x : nums)
            if(x > 0)
                pc++;
            else if(x < 0)
                nc++;
        return Math.max(pc, nc);
    }
}
