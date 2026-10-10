class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k == n)
            return Arrays.stream(nums).max().getAsInt();
        if (k == 1) {
            Map<Integer, Integer> ct = new HashMap<>();
            for (int x : nums)
                ct.merge(x, 1, Integer :: sum);
            int ans = -1;
            for (int num : ct.keySet())
                if (ct.get(num) == 1)
                    ans = Math.max(ans, num);
            return ans;
        }
        int first = nums[0], last = nums[n - 1];
        int fc = 0, lc = 0;
        for (int i = 0; i < n; i++){   
            if (nums[i] == first)
                fc++;
            else if (nums[i] == last)
                lc++;
        }
        boolean x = fc == 1;
        boolean y = lc == 1;
        if (x && y)
            return Math.max(first, last);
        if (x)
            return first;
        if (y)
            return last;
        return -1;
    }
}
