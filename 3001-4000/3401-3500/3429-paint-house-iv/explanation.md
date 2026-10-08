# Explanation

## Idea
- Paint mirror-positioned pairs from the ends toward the center.
- Memoize the minimum remaining cost by pair index and the previous left and right colors, using color three as the initial sentinel.
- Try all pair colors that differ from each other and from their respective outward neighbors.

## Why It Works
- Choosing unequal colors in a pair enforces the mirror restriction, while rejecting each outward neighbor's color enforces adjacency as the process moves inward.
- At the center, the same pair-inequality check also enforces the last adjacent pair. The state records all restrictions affecting future choices, so minimizing over legal transitions yields the optimum.

## Edge Cases
- Two houses are a single pair requiring unequal colors.
- Zero painting costs are valid; the sentinel excludes none of the three real colors.

## Complexity
- Time: $O(n)$ with a constant number of color states and transitions per pair.
- Auxiliary space: $O(n)$ for memoization and recursion.

## Notes
- The recursion reaches depth `n / 2`, up to 50000 under the constraints, risking Java stack overflow. The existing solution is unchanged.
- Costs accumulate as `long`; the per-pair integer addition remains within range.
