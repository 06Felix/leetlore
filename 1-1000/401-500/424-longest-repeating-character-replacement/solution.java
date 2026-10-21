class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int mxCt = 0;
        int[] ct = new int[26];
        for (int l = 0, r = 0; r < s.length(); ++r) {
            mxCt = Math.max(mxCt, ++ct[s.charAt(r) - 'A']);
            while (mxCt + k < r - l + 1)
                --ct[s.charAt(l++) - 'A'];
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
