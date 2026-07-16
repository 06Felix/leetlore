# Explanation

Problem: [Wildcard Matching](https://leetcode.com/problems/wildcard-matching/)

## Idea

- Use `dp[i][j]` to mean `s[0..i)` matches `p[0..j)`.
- Initialize `dp[0][0] = true`, then allow leading `*` characters to match the empty string.
- For `*`, transition from either matching nothing (`dp[i + 1][j]`) or consuming one more character (`dp[i][j + 1]`).
- For a normal character or `?`, copy `dp[i][j]` when the current characters are compatible.

## Why It Works

- Every match of prefixes ends with either a literal/`?` pair or a `*` decision.
- The literal and `?` case is valid exactly when the previous prefixes matched.
- A `*` can represent an empty sequence or extend a sequence it already matched, which the two transitions cover.
- Filling all prefix states bottom-up gives the truth value for matching the full string against the full pattern.

## Edge Cases

- Empty `s` can still match patterns made only of `*`.
- Empty `p` matches only empty `s`.
- Consecutive `*` characters are handled naturally by the same transitions.

## Complexity

- Time: $O(mn)$ for string length `m` and pattern length `n`.
- Space: $O(mn)$.

## Notes

- The helper returns true for `?` or for an exact character match at the current positions.
