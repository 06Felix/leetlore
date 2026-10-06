class Solution {
    public long minimumSteps(String s) {
        int ct1 = 0;
        long ans = 0;
        for(char ch : s.toCharArray())
            if(ch == '1')
                ct1++;
            else
                ans += ct1;
        return ans;
    }
}
