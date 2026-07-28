class Solution:
    def maxScore(self, a: List[int], b: List[int]) -> int:
        n = len(b)
        dp = [[-float('inf')] * 5 for _ in range(n + 1)]
        dp[0][0] = 0
        
        for i in range(1, n + 1):
            for j in range(5):
                dp[i][j] = max(dp[i][j], dp[i-1][j])
                if j > 0:
                    dp[i][j] = max(dp[i][j], dp[i-1][j-1] + a[j-1] * b[i-1])
        
        return dp[n][4]
