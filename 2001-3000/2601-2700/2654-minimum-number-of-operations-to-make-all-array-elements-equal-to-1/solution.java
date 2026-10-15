class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;
        int gcd = nums[0];
        for (int i : nums) {
            if (i == 1)
                cnt++;
            gcd = gcd(gcd, i);
        }
        if (cnt != 0)
            return nums.length - cnt;
        if (gcd != 1)
            return -1;
        int index = 0;
        while (true) {
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = gcd(nums[i], nums[i + 1]);
                if (nums[i] == 1)
                    return nums.length + index;
            }
            index++;
        }
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
