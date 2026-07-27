# Explanation

## Idea

The solution uses dynamic programming over prefixes. `dp[i][j]` is the number of ways to form the first `j` characters of `t` using the first `i` characters of `s`.

For each character in `s`, the code either skips it or, when it matches the next needed character in `t`, uses it.

## Why It Works

There is exactly one way to form an empty target from any prefix of `s`: choose nothing. That initializes `dp[i][0] = 1`.

If `s[i - 1] == t[j - 1]`, every valid subsequence either uses this matching character or skips it, so the count is `dp[i - 1][j - 1] + dp[i - 1][j]`.

If the characters do not match, this character cannot finish the target prefix, so only the skip count `dp[i - 1][j]` remains.

## Edge Cases

- Empty target returns `1`.
- If the target is longer than the source, the recurrence naturally leaves the answer `0`.
- Repeated characters are counted separately because each source index creates distinct choices.

## Complexity

Time: `O(m * n)`, where `m = s.length()` and `n = t.length()`.

Space: `O(m * n)`.
