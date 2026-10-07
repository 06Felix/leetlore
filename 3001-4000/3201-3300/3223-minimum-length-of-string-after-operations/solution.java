class Solution {
    public int minimumLength(String s) {
        int ans = 0;
        int[] ct = new int[26];
        for(char c : s.toCharArray())
            ct[c - 'a']++;
        for(int i = 0 ; i < 26 ; i++){
            if(ct[i] == 0)
                continue;
            if((ct[i] & 1) == 0)
                ans += 2;
            else
                ans += 1;
        }
        return ans;
    }
}
