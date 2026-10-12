class Solution {
    boolean isV(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxFreqSum(String s) {
        int[] ct = new int[26];
        char[] str = s.toCharArray();
        for(char ch : str)
            ct[ch - 'a']++;
        int v = 0, c = 0;
        for(char i = 'a'; i <= 'z'; i++)
            if(isV(i))
                v = Math.max(v, ct[i - 'a']);
            else
                c = Math.max(c, ct[i - 'a']);
        return v + c;
    }
}
