class Solution {
public:
    int minimumSumSubarray(std::vector<int>& nums, int l, int r) {
        int n = nums.size();
        int ans = 100001;
        for (int i = 0; i < n; ++i) {
            int rsum = 0;
            for (int j = i; j < min(n, i + r); ++j) {
                rsum += nums[j];
                if (j - i + 1 >= l && rsum > 0)
                    ans = min(ans, rsum);
            }
        }
        return ans < 100001 ? ans : -1;
    }
};
