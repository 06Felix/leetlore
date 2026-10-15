class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for(String st : strs){
            int c0 = 0, c1 = 0;
            for(char ch : st.toCharArray())
                if(ch == '1')
                    c1++;
                else
                    c0++;
            for(int i = m ; i >= c0 ; i--)
                for(int j = n ; j >= c1 ; j--)
                    dp[i][j] = Math.max(dp[i][j], dp[i - c0][j - c1] + 1);
        }
        return dp[m][n];
    }
}
