class Solution {
    public int minOperations(int[] nums, int k) {
        int tx = 0;
        for(int n : nums)
            tx ^= n;
        return Integer.bitCount(tx ^ k);
    }
}
