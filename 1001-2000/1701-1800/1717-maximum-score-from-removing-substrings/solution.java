class Solution {
    public int maximumGain(String s, int x, int y) {
        char[] str = s.toCharArray();
        int ans = 0;
        int a = 0;
        int b = 0;
        char c1 = x > y ? 'a' : 'b';
        char c2 = (c1 == 'a') ? 'b' : 'a';
        int mx = Math.max(x, y);
        int mn = Math.min(x, y);
        for (char c : str) {
            if (c == c1)
                a++;
            else if (c == c2) {
                if (a > 0) {
                    a--;
                    ans += mx;
                }
                else {
                    b++;
                }
            } 
            else {
                ans += Math.min(a, b) * mn;
                a = 0;
                b = 0;
            }
        }
        return ans + Math.min(a, b) * mn;
    }
}
