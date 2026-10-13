class Solution {
    public int lengthOfLastWord(String s) {
        char[] str = s.trim().toCharArray();
        int n = str.length;
        for (int i = n - 1; i >= 0; i--)
            if (str[i] == ' ')
                return n - i - 1;
        return n;
    }
}
