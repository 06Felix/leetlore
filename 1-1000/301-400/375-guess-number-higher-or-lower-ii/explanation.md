## Idea
- Let dp[i][j] be the minimum money guaranteeing success for a secret in [i, j].
- Fill intervals in increasing length, testing every first guess k and minimizing k + max(dp[i][k - 1], dp[k + 1][j]). Empty and singleton intervals cost zero.

## Why It Works
- A wrong guess costs k and leaves either the smaller or larger interval; the larger continuation cost is the worst case.
- Choosing the best first guess and optimal already-computed subinterval strategies gives the minimum guaranteed budget. A correct first guess costs zero, which cannot exceed the nonnegative wrong-guess worst case.

## Edge Cases
- n = 1 returns zero; n = 2 returns one.
- Extra array padding permits boundary guesses without special empty-interval checks.

## Complexity
- O(n³) time for O(n²) intervals and up to n guesses each.
- O(n²) auxiliary space for dp.
