class Solution:
    def minimumOperationsToWriteY(self, grid: List[List[int]]) -> int:
        n = len(grid)
        def numC(y,r):
            ct = 0
            for i in range(n):
                for j in range(n):
                    if i <= n//2:
                        if (i == j or i == n - j - 1):
                            if grid[i][j] != y:
                                ct += 1
                        else:
                            if grid[i][j] != r:
                                ct += 1
                    else:
                        if j == n//2:
                            if grid[i][j] != y:
                                ct += 1
                        else:
                            if grid[i][j] != r:
                                ct += 1
            return ct
        return min(
            numC(0,1),
            numC(0,2),
            numC(1,0),
            numC(1,2),
            numC(2,0),
            numC(2,1)
        )
