class Solution(object):
    def sumOfGoodSubsequences(self, nums):
        mod = 1000000007
        ct = Counter()
        ans = Counter()
        for i in nums:
            curCt = ct[i - 1] + ct[i + 1] + 1
            ct[i] += curCt
            curCt = ct[i - 1] + ct[i + 1] + 1
            ans[i] += ans[i - 1] + ans[i + 1]
            ans[i] += (curCt) * i
        return sum(ans.values()) % mod
