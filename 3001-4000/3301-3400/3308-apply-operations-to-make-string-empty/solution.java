class Solution {
    public String lastNonEmptyString(String s) {
        int[] ct = new int[128];
        int mx = 0;
        for(char ch : s.toCharArray()){
            ct[ch]++;
            mx = Math.max(mx,ct[ch]);
        }
        String ans = "";
        for(char ch : s.toCharArray()){
            ct[ch]++;
            if(ct[ch] == 2 * mx)
                ans += ch;
        }
        return ans;
    }
}
