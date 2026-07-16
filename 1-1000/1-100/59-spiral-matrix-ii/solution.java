class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int a = 1;
        for(int st = 0;st < n/2 ;st++){
            int end = n - st - 1;
            for(int i=st;i<end;i++)
                ans[st][i] = a++;
            for(int i=st;i<end;i++)
                ans[i][end] = a++;
            for(int i=end;i>st;i--)
                ans[end][i] = a++;
            for(int i=end;i>st;i--)
                ans[i][st] = a++;
        }
        if(n % 2 == 1)
            ans[n/2][n/2] = a++;
        return ans;
    }
}
