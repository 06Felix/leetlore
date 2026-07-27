class Solution:
    def winningPlayerCount(self, n: int, pick: List[List[int]]) -> int:
        pc = [{} for _ in range(n)]
        for pl, cl in pick:
            if cl not in pc[pl]:
                pc[pl][cl] = 0
            pc[pl][cl] += 1
        ans = 0
        for i in range(n):
            for cc in pc[i].values():
                if cc > i:
                    ans += 1
                    break
        return ans
