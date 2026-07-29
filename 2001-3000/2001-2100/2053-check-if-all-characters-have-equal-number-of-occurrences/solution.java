class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] ct = new int[26];
        int rq = 0;
        for(char ch : s.toCharArray())
            rq = ++ct[ch - 'a'];
        for(int i = 0 ; i < 26 ; i++)
            if(ct[i] != 0 && ct[i] != rq)
                return false;
        return true;
    }
}
