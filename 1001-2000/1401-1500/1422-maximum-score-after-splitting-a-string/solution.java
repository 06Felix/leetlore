class Solution {
    public int maxScore(String s) {
        int ans = 0, c0 = 0, c1 = 0;
        for(char ch : s.toCharArray())
            if(ch == '1')
                c1++;
        for(int i = 0 ; i < s.length() - 1 ; i++){
            if(s.charAt(i) == '0')
                c0++;
            else
                c1--;
            ans = Math.max(ans, c0 + c1);
        }
        return ans;
    }
}
