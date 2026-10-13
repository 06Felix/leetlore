class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] ct = new int[128];
        char[] str = s.toCharArray();
        int n = str.length;
        for (int l = 0, r = 0; r < n; ++r) {
            ++ct[str[r]];
            while (ct[str[r]] > 1)
                --ct[str[l++]];
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
