class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] ct = new int[26];
        int l1 = s1.length();
        int l2 = s2.length();
        int req = l1;
        for (char c : s1.toCharArray())
            ct[c - 'a']++;
        for (int l = 0, r = 0; r < l2 ; ++r) {
            if (--ct[s2.charAt(r) - 'a'] >= 0)
                req--;
            while (req == 0) {
                if (r - l + 1 == l1)
                    return true;
                if (++ct[s2.charAt(l++) - 'a'] > 0)
                    req++;
            }
        }
        return false;
    }
}
