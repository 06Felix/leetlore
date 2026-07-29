class Solution {
    public int minTimeToType(String word) {
        int cr = 'a';
        int ans = 0;
        for(char ch : word.toCharArray()){
            int df = Math.abs(cr - ch);
            ans += Math.min(df, 26 - df);
            cr = ch;
        }
        return ans + word.length();
    }
}
