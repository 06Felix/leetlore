class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k)
            return false;
        int[] ct = new int[26];
        for (char c : s.toCharArray())
            ct[c - 'a'] ^= 1;
        int oC = 0;
        for(int i = 0 ; i < 26 ; i++)
            oC += ct[i];
        return oC <= k;
    }
}
