class Solution {
public:
    int f(int ind,int &n,int &mask,vector<vector<int>> &dp)
    {
        if(ind == n+1)   return 1;
        if(dp[ind][mask] != -1) return dp[ind][mask];
        int ans = 0;
        for(int i=1; i<=n; i++)
        {
            if(((1<<i) & mask) == 0)
            {
                if(ind%i == 0 || i%ind == 0)
                {
                    int x = mask;
                    mask |= (1<<i);
                    ans += f(ind+1,n,mask,dp);
                    mask = x;
                }
            }
        }
        return dp[ind][mask] = ans;
    }
    int countArrangement(int n) {
        int x = 0;
        vector<vector<int>> dp(n+1 , vector<int> ((1<<(n+1)) , -1));
        return f(1,n,x,dp);
    }
};
