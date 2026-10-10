class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int l1 = s1.length;
        int l2 = s2.length;
        int[][] dp = new int[l1 + 1][l2 + 1];
        for(int i = 0 ; i <= l1 ; i++)
            for(int j = 0 ; j <= l2; j++)
                if(i == 0)
                    dp[i][j] = j;
                else if(j == 0)
                    dp[i][j] = i;
                else if(s1[i - 1] == s2[j - 1])
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], dp[i - 1][j]);
        StringBuilder ans = new StringBuilder();
        int i = l1, j = l2;
        while(i > 0 && j > 0){
            if(s1[i - 1] == s2[j - 1]){
                ans.append(s1[i - 1]);
                i--;
                j--;
            }
            else if(dp[i - 1][j] < dp[i][j - 1]){
                ans.append(s1[i - 1]);
                i--;
            }
            else{
                ans.append(s2[j - 1]);
                j--;
            }
        }
        while(i-- > 0)
            ans.append(s1[i]);
        while(j-- > 0)
            ans.append(s2[j]);
        return ans.reverse().toString();
    }
}
