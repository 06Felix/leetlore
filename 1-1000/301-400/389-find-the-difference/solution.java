class Solution {
    public char findTheDifference(String s, String t) {
        int[] ct = new int[26];
        for(char ch : s.toCharArray())
            ct[ch - 'a'] ++;
        for(char ch : t.toCharArray())
            ct[ch - 'a'] ++;
        int i;
        for(i = 0;i<26;i++){
            if(ct[i]%2 == 1)
                break;
        }
        return (char)(i+'a');
    }
}
