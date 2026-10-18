class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int div = 0;
            for (int i = 2; i * i <= num; ++i)
                if (num % i == 0) {
                    if (div == 0)
                        div = i;
                    else {
                        div = 0;
                        break;
                    }
                }
            if (div != 0 && div * div < num)
                ans += 1 + num + div + num / div;
        }
        return ans;
    }
}
