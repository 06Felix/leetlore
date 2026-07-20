class Solution {
    private boolean isV(char ch){
        return "aeiou".indexOf(ch) >= 0;
    }
    public int maxVowels(String s, int k) {
        int ans = 0;
        int[] v = new int[s.length()];
        for(int i = 0 ; i < s.length() ; i++)
            v[i] = isV(s.charAt(i)) ? 1 : 0;
        for(int i = 0 ; i < k ; i++)
            ans += v[i];
        int t = ans;
        for(int i = k ; i < s.length() ; i++){
            t += v[i] - v[i - k];
            ans = Math.max(ans, t);
        }
        return ans;
    }
}
