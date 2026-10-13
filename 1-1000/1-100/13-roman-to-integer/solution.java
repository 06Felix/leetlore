class Solution {
    int value(char x) {
        switch (x) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
        }
    }
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        char[] str = s.toCharArray();
        for (int i = 0; i < n - 1; i++) {
            if (value(str[i]) >= value(str[i + 1]))
                ans += value(str[i]);
            else
                ans -= value(str[i]);
        }
        ans += value(str[n - 1]);
        return ans;
    }
}
