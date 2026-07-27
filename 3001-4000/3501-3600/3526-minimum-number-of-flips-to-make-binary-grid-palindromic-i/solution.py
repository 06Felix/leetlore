class Solution:
    def minFlips(self, grid: List[List[int]]) -> int:
        def flipsReq(line: List[int]) -> int:
            n = len(line)
            ans = 0
            for i in range(n // 2):
                if line[i] != line[n - i - 1]:
                    ans += 1
            return ans
        n, m = len(grid), len(grid[0])
        rf = sum(flipsReq(grid[i]) for i in range(n))
        cf = sum(flipsReq([grid[i][j] for i in range(n)]) for j in range(m))
        return min(rf, cf)
