class Solution {
    public boolean divideArray(int[] nums) {
        int[] ct = new int[501];
        for(int x : nums)
            ct[x]++;
        for(int i = 0; i <= 500; i++)
            if((ct[i] & 1) == 1)
                return false;
        return true;
    }
}
