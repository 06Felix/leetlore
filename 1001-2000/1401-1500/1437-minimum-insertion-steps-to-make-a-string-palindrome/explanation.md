# Explanation

## Idea

The solution first computes the longest palindromic subsequence length. Characters in that subsequence can stay fixed, and every other character must be mirrored by an insertion.

So the answer is `s.length() - longestPalindromeSubseq(s)`.

## Why It Works

`dp[i][j]` stores the longest palindromic subsequence inside `s[i..j]`.

When the two ends match, they can wrap the best answer inside them. Otherwise, the best palindrome must skip one end and take the larger remaining result.

Keeping the longest existing palindrome minimizes how many characters need inserted around it.

## Edge Cases

- Already-palindromic strings return `0`.
- Single characters have subsequence length `1`.
- The expression `dp[i + 1][j - 1]` is safe for adjacent matching characters because Java arrays default to `0`.

## Complexity

Time: `O(n^2)`.

Space: `O(n^2)`.
