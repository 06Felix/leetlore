class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] pos = new Integer[n];

        for (int i = 0; i < n; ++i)
            pos[i] = i;

        Arrays.sort(pos, (first, second) -> {
            int sum1 = digit(nums[first]);
            int sum2 = digit(nums[second]);

            if (sum1 != sum2)
                return Integer.compare(sum1, sum2);

            return Integer.compare(nums[first], nums[second]);
        });

        boolean[] seen = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; ++i) {
            if (seen[i])
                continue;

            int size = 0;
            int cur = i;

            while (!seen[cur]) {
                seen[cur] = true;
                cur = pos[cur];
                ++size;
            }

            ans += size - 1;
        }

        return ans;
    }

    private int digit(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
