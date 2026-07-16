class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c1 = 0;
        int c0 = 0;
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray())
            if (ch == '1')
                c1++;
            else
                c0++;
        for (int i=0; i < c1-1 ; i++)
            ans.append('1');
        for (int i=0; i < c0 ; i++)
            ans.append('0');
        ans.append('1');
        return ans.toString();
    }
}
