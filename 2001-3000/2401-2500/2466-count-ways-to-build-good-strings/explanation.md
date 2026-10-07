# Explanation

## Idea
- Let `dp[i]` count strings of length `i`, with one way to build the empty prefix.
- Add `dp[i - zero]` when a zero block fits and `dp[i - one]` when a one block fits, reducing modulo $10^9 + 7$.
- Sum all counts for lengths from `low` through `high`.

## Why It Works
- Every nonempty constructed string ends in either a zero block or a one block. Removing that final block gives exactly the corresponding shorter state.
- The final bit distinguishes the two cases, so they are disjoint. Positive block lengths let increasing-length DP compute every predecessor first.

## Edge Cases
- Equal block lengths still create two distinct extensions because their bits differ.
- Unreachable lengths keep count zero; both endpoints of the requested length interval are included.

## Complexity
- Time: $O(high)$ with two possible transitions per length.
- Auxiliary space: $O(high)$ for the DP array.
