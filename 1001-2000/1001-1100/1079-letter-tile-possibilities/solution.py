class Solution:
    def numTilePossibilities(self, tiles: str) -> int:
        # return len(set(p for i in range(1, len(tiles) + 1) for p in permutations(tiles, i)))
        st = set()
        for l in range(1, len(tiles) + 1):
            for p in permutations(tiles, l):
                st.add(p)
        return len(st)
