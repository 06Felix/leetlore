class Solution {
    public int numJewelsInStones(String j, String s) {
        boolean[] ct = new boolean[128];
        for(char ch : j.toCharArray())
            ct[ch] = true;
        int ans = 0;
        for(char ch : s.toCharArray())
            if(ct[ch])
                ans++;
    return ans;
    }
}
