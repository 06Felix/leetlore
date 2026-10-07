class Solution {
    public int[] singleNumber(int[] nums) {
        int tot = 0;
        for(int x : nums)
            tot ^= x;
        int rmb = (tot & (tot - 1)) ^ tot;
        int a1 = 0, a2 = 0;
        for(int x : nums){
            if((x & rmb) == 0)
                a2 ^= x;
            else
                a1 ^= x;
        }
        return new int[]{a1, a2};
    }
}
