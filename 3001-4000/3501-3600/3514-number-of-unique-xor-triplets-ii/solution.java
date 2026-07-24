class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] have = new boolean[2048];

        for (int num : nums)
            have[num] = true;

        boolean[] pair = new boolean[2048];

        for (int i = 0; i < 2048; ++i)
            if (have[i])
                for (int j = 0; j < 2048; ++j)
                    if (have[j])
                        pair[i ^ j] = true;

        boolean[] seen = new boolean[2048];

        for (int i = 0; i < 2048; ++i)
            if (pair[i])
                for (int num : nums)
                    seen[i ^ num] = true;

        int ans = 0;

        for (boolean ok : seen)
            if (ok)
                ++ans;

        return ans;
    }
}
