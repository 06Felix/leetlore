class Solution {
    public boolean canConstruct(String rn, String mag) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for(char ch : rn.toCharArray())
            c1[ch - 'a']++;
        for(char ch : mag.toCharArray())
            c2[ch - 'a']++;
        for(int i = 0 ; i < 26 ; i++)
            if(c1[i] > c2[i])
                return false;
        return true;
    }
}
