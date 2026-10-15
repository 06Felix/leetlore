class Solution {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int l = strs[0].length();
        int n = strs.length;
        for (int j = 0; j < l; ++j)
            for (int i = 0; i + 1 < n; ++i)
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    ++ans;
                    break;
                }
        return ans;
    }
}
