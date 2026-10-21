class Solution {
    private static final int BASE = 26;
    private static final long HASH = 8_417_508_174_513L;
    public String longestPrefix(String s) {
        int n = s.length();
        int maxLength = 0;
        long pow = 1;
        long prefixHash = 0;
        long suffixHash = 0;
        for (int i = 0, j = n - 1; i < n - 1; ++i, --j) {
            prefixHash = (prefixHash * BASE + val(s.charAt(i))) % HASH;
            suffixHash = (val(s.charAt(j)) * pow + suffixHash) % HASH;
            pow = pow * BASE % HASH;
            if (prefixHash == suffixHash)
                maxLength = i + 1;
        }

        return s.substring(0, maxLength);
    }

    private int val(char c) {
        return c - 'a';
    }
}
