class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        sd = sum(n for n in nums if 1 <= n <= 9)
        dd = sum(n for n in nums if 10 <= n <= 99)
        ts = sum(nums)
        tsd = ts - sd
        tdd = ts - dd
        return sd > tsd or dd > tdd
