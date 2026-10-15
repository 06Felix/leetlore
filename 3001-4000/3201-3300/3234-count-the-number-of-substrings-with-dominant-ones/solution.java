class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int n = s.length();
        char[] str = s.toCharArray();
        for (int z = 0; z + z * z <= n; ++z) {
            int prv = -1;
            int[] ct = new int[2];
            for (int l = 0, r = 0; r < n; ++r) {
                ++ct[str[r] - '0'];
                for (; l < r; ++l)
                    if (str[l] == '0' && ct[0] > z) {
                        --ct[0];
                        prv = l;
                    }
                    else if (str[l] == '1' && ct[1] - 1 >= z * z)
                        --ct[1];
                    else
                        break;
                if (ct[0] == z && ct[1] >= z * z)
                    ans += l - prv;
            }
        }
        return ans;
    }
}
