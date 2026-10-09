class Solution {
    public String findValidPair(String s) {
        int[] ct = new int[10];
        char[] str = s.toCharArray();
        int n = str.length;
        for(char c : str)
            ct[c - '0']++;
        for(int i = 0 ; i < n - 1 ; i++)
            if(str[i] != str[i + 1] && ct[str[i] - '0'] == str[i] - '0' && ct[str[i + 1] - '0'] == str[i + 1] - '0')
                return s.substring(i, i + 2);
        return "";
    }
}
