# Palindrome Partitioning II

## Idea

- `cut[i]` stores the minimum cuts needed for prefix `s[0..i]`.
- `pal[j][i]` records whether substring `s[j..i]` is a palindrome.
- For each ending index `i`, the code tries every starting index `j`.
- If `s[j..i]` is a palindrome, it updates the best cut count for `i`.

## Why It Works

- A substring is a palindrome if its ends match and its inner substring is a palindrome or empty.
- If `s[j..i]` is the final palindrome block, the required cuts are `0` when `j == 0`, otherwise `cut[j - 1] + 1`.
- Trying every possible `j` includes the optimal final block.
- Building by increasing `i` ensures inner palindrome states and previous cuts are already available.

## Edge Cases

- A one-character string returns `0`.
- A fully palindromic prefix sets its cut count to `0`.
- Non-palindromic adjacent characters fall back to separate partitions.

## Complexity

- Time: $O(n^2)$.
- Space: $O(n^2)$ for the palindrome table.
