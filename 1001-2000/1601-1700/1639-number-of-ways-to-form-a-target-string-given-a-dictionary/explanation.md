# Explanation

## Idea
- Process dictionary columns from left to right, counting each column's 26 letter frequencies.
- Let `dp[i]` count ways to form the first `i` target letters using processed columns, starting with `dp[0] = 1`.
- Update target lengths backward with `dp[i] += dp[i - 1] * count[target[i - 1]]`, modulo $10^9 + 7$.

## Why It Works
- Keeping the old count represents skipping the column; the added term chooses any matching word entry in that column to extend a shorter target prefix.
- Backward updates read counts from before the current column, so a column can be used at most once. Increasing column order enforces the restriction across every word.

## Edge Cases
- A column without the needed letter adds zero ways.
- A target longer than the dictionary's column count cannot be completed and returns zero.

## Complexity
- Time: $O(C(W + T))$ for `C` columns, `W` words, and target length `T`.
- Auxiliary space: $O(T + 26)$ for the DP and current column frequencies.

## Notes
- The DP uses `long` for multiplication before reducing modulo the required modulus.
