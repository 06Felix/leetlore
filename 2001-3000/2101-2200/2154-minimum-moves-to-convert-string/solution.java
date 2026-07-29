class Solution {
    public int minimumMoves(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; ) {
            if(s.charAt(i) == 'O')
                i++;
            else{
                ans++;
                i += 3;
            }
        }
        return ans;
    }
}
