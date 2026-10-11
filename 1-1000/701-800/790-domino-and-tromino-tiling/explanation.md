# Domino and Tromino Tiling

## Idea
- Seed the counts for widths one, two, and three as 1, 2, and 5.
- For later widths, compute `dp[i] = 2 * dp[i - 1] + dp[i - 3]` modulo $10^9+7$.

## Why It Works
- Let $f_i$ count full boards and $g_i$ count boards with one specified corner gap. Then $f_i=f_{i-1}+f_{i-2}+2g_{i-1}$ and $g_i=g_{i-1}+f_{i-2}$.
- Eliminating the gap state yields $f_i=2f_{i-1}+f_{i-3}$, the recurrence implemented after the explicit base cases.

## Edge Cases
- Widths one through three return their seeded values without entering the loop.
- The fixed array covers the maximum width 1000, and `long` safely holds the intermediate modular sum.

## Complexity
- Time: $O(n+1001)$ including allocation and initialization of the fixed table.
- Space: $O(1001)$ for the table; the implementation retains all computed counts.
