# Explanation

## Idea

The solution computes the longest common subsequence between the string and its reverse.

A subsequence that appears in both the original string and the reversed string corresponds to characters that can be read the same forward and backward, so the LCS length is the longest palindromic subsequence length.

## Why It Works

The DP table `dp[i][j]` stores the LCS length for the first `i` characters of the original string and the first `j` characters of the reversed string.

When the current characters match, the subsequence can extend by one from `dp[i - 1][j - 1]`. Otherwise, the best answer skips one character from either side and takes the larger result.

The final cell contains the LCS length for both full strings.

## Edge Cases

- Empty prefixes are covered by the extra zero row and column.
- A one-character string returns `1`.
- Repeated characters are handled by the standard LCS recurrence.

## Complexity

Time: `O(n^2)`.

Space: `O(n^2)`.
