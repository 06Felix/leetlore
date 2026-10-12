class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] ans = new String[(s.length() + k - 1) / k];
        int id = 0;
        for(int i = 0 ; i < s.length() ; i += k)
            ans[id++] = i + k <= s.length() ? s.substring(i, i + k) : s.substring(i) + String.valueOf(fill).repeat(i + k - s.length());
        return ans;
    }
}
