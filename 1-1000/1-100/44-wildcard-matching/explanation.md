# Wildcard Matching

## Idea

- `dp[i][j]` means `s[0..i)` matches `p[0..j)`.
- The empty string matches an initial run of `'*'` characters, so the first row is initialized separately.
- For `'*'`, the code either uses it as empty (`dp[i + 1][j]`) or lets it consume one more character (`dp[i][j + 1]`).
- For a normal character or `'?'`, the match depends on `dp[i][j]`.

## Why It Works

- The DP state records exactly the prefixes already matched.
- A star has only two meaningful choices: match nothing or extend over the current character.
- A question mark and equal literal character both consume one character from each prefix.
- The final state `dp[m][n]` represents a full-string, full-pattern match.

## Edge Cases

- Empty `s` can match only patterns made entirely of leading stars.
- Empty `p` matches only empty `s`.
- Consecutive stars are handled naturally by the same star transition.

## Complexity

- Time: $O(mn)$.
- Space: $O(mn)$.
