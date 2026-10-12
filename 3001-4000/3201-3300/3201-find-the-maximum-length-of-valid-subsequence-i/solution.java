class Solution {
    public int maximumLength(int[] nums) {
        int ct1 = 0, ct2 = 0;
        for (int num : nums)
            if (num % 2 == 0)
                ct1++;
            else
                ct2++;
        int even = 0, odd = 0;
        for (int num : nums)
            if (num % 2 == 0)
                even = Math.max(even, odd + 1);
            else
                odd = Math.max(odd, even + 1);
        return Math.max(Math.max(ct1, ct2), Math.max(even, odd));
    }
}
