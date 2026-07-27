# Explanation

## Idea

Use a two-dimensional dynamic programming table. `dp[i][j]` stores the longest common subsequence length using the first `i` characters of `text1` and the first `j` characters of `text2`.

## Why It Works

If the current characters match, they can extend the best subsequence from both previous prefixes, so the value is `dp[i - 1][j - 1] + 1`.

If they differ, the best answer must skip one of the two current characters, so the value is `max(dp[i - 1][j], dp[i][j - 1])`.

The extra zero row and column represent empty prefixes.

## Edge Cases

- No shared characters leaves all useful states at `0`.
- Identical strings increase by one at every matched character.
- Length-one prefixes are handled by the zero padding.

## Complexity

Time: `O(n * m)`.

Space: `O(n * m)`.
