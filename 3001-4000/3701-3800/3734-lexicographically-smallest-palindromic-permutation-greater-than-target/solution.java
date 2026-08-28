class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];

        for (char ch : s.toCharArray())
            ++freq[ch - 'a'];

        int[] cnt = new int[26];
        int odd = 0;
        char mid = 0;

        for (int i = 0; i < 26; ++i) {
            if ((freq[i] & 1) == 1) {
                ++odd;
                mid = (char) ('a' + i);
            }

            cnt[i] = freq[i] / 2;
        }

        if (odd > 1)
            return "";

        int size = n / 2;
        String need = target.substring(0, size);
        int[] left = cnt.clone();
        StringBuilder pref = new StringBuilder();
        String next = "";
        boolean same = true;

        for (int i = 0; i < size; ++i) {
            int want = need.charAt(i) - 'a';

            for (int ch = want + 1; ch < 26; ++ch) {
                if (left[ch] > 0) {
                    next = make(pref, ch, left);
                    break;
                }
            }

            if (left[want] == 0) {
                same = false;
                break;
            }

            --left[want];
            pref.append((char) ('a' + want));
        }

        if (same) {
            String ans = build(pref.toString(), mid);

            if (ans.compareTo(target) > 0)
                return ans;
        }

        if (!next.isEmpty())
            return build(next, mid);

        return "";
    }

    private String make(StringBuilder pref, int ch, int[] cnt) {
        StringBuilder ans = new StringBuilder(pref);

        ans.append((char) ('a' + ch));
        --cnt[ch];

        for (int i = 0; i < 26; ++i)
            for (int j = 0; j < cnt[i]; ++j)
                ans.append((char) ('a' + i));

        ++cnt[ch];

        return ans.toString();
    }

    private String build(String left, char mid) {
        StringBuilder ans = new StringBuilder(left);

        if (mid != 0)
            ans.append(mid);

        for (int i = left.length() - 1; i >= 0; --i)
            ans.append(left.charAt(i));

        return ans.toString();
    }
}
