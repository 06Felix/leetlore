class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int MOD = 1_000_000_007;
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;
        for (int i = 0; i < t; i++) {
            int[] newFreq = new int[26];
            for (int j = 0; j < 25; j++) {
                newFreq[j + 1] = freq[j];
            }
            newFreq[0] = freq[25];
            newFreq[1] = (newFreq[1] + freq[25]) % MOD;
            freq = newFreq;
        }
        int length = 0;
        for (int count : freq)
            length = (length + count) % MOD;
        return length;
    }
}
