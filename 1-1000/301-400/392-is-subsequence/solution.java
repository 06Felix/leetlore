class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        int n = s1.length;
        char[] s2 = t.toCharArray();
        int m = s2.length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s1[i] == s2[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == n;
    }
}
