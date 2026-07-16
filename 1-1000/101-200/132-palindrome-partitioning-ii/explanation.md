# Explanation

## Idea

- Build `pal[j][i]` to mark whether `s[j..i]` is a palindrome.
- Let `cut[i]` be the minimum cuts needed for prefix `s[0..i]`.
- For each end index `i`, try every start index `j` of a palindromic suffix ending at `i`.

## Why It Works

- `s[j..i]` is a palindrome when the end characters match and the inside substring is empty or already known palindrome.
- If `j == 0`, the whole prefix is a palindrome and needs zero cuts.
- Otherwise, the best partition using suffix `s[j..i]` is `cut[j - 1] + 1`.
- Taking the minimum over all palindromic suffixes gives the optimal value for each prefix.

## Edge Cases

- A one-character string returns `0`.
- Already-palindromic prefixes are reset to `0` cuts.
- Repeated characters are handled through the same inner-palindrome transition.

## Complexity

- Time: $O(n^2)$.
- Space: $O(n^2)$ for the palindrome table and $O(n)$ for cuts.
