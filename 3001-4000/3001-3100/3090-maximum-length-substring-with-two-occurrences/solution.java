class Solution {
    public int maximumLengthSubstring(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int[] freq = new int[26];
        int l = 0;
        int ans = 0;

        for (int r = 0; r < n; ++r) {
            int idx = str[r] - 'a';
            ++freq[idx];

            while (freq[idx] > 2) {
                --freq[str[l] - 'a'];
                ++l;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
