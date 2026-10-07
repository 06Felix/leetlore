# Explanation

## Idea
- Let `dp[i][j]` count playlists of length `i` using exactly `j` distinct songs, starting from `dp[0][0] = 1`.
- Extend with a new song in `n - j + 1` ways from `dp[i - 1][j - 1]`, or replay in `max(0, j - k)` ways from `dp[i - 1][j]`.
- Return the length-`goal` count using all `n` songs, modulo $10^9 + 7$.

## Why It Works
- A final new song must be chosen from those absent from the earlier playlist, yielding the first transition.
- In a valid prefix, the last `k` played songs are distinct and blocked from replay. Among `j` used songs, exactly `j - k` are eligible when positive.
- New and replayed final songs are disjoint cases covering every valid playlist.

## Edge Cases
- With `k == 0`, any previously used song may immediately replay.
- When `goal == n`, every song must appear exactly once; when `j <= k`, the replay term is zero.

## Complexity
- Time: $O(goal\cdot n)$ for the full DP table.
- Auxiliary space: $O(goal\cdot n)$ for its stored counts.

## Notes
- Multiplications use `long` before reduction modulo the required modulus.
