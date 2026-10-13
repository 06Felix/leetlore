class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            int j = i;
            while(j + 1 < n && nums[j + 1] == nums[j] + 1)
                j++;
            if (j != i) {
                sb.append("->").append(nums[j]);
                i = j;
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}
