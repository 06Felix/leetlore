class Solution {
    public int maxDifference(String s) {
        int[] ct = new int[26];
        for (char ch : s.toCharArray())
            ct[ch - 'a']++;
        int mne = 101;
        int mxo = 0;
        for (int i = 0; i < 26; i++)
            if ((ct[i] & 1) == 0) {
                if (ct[i] != 0)
                    mne = Math.min(mne, ct[i]);
            }
            else
                mxo = Math.max(mxo, ct[i]);
        if (mne == 101)
            mne = 0;
        return mxo - mne;
    }
}
