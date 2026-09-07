# Distinct Subsequences II

## Idea

- Track how many distinct non-empty subsequences end with each character.
- `end[c]` means the number of distinct subsequences whose last character is `c`.
- When reading a new character `ch`, append it to every existing subsequence and also take `ch` alone.
- Replace `end[ch]` with that new total to avoid counting duplicates from earlier same characters.

## Why It Works

- Every non-empty subsequence has exactly one last character, so summing all `end` values gives the answer.
- A new `ch` can form `1 + totalExisting` subsequences: the single-character subsequence plus one extension of each old subsequence.
- If `ch` appeared before, old subsequences ending with `ch` would duplicate some of these new ones.
- Assigning `end[ch] = 1 + totalExisting` keeps only the latest complete set for that ending character.

## Edge Cases

- Repeated characters like `"aaa"` are handled by replacement instead of addition.
- All unique characters double the count each step, modulo `1e9 + 7`.
- The answer excludes the empty subsequence, so the DP starts each character update with `1` for the single-character subsequence.

## Complexity

- Time: `O(26 * n)`, effectively `O(n)`.
- Space: `O(26)`.

## Tags

- Dynamic Programming
- String
- Counting
- Modular Arithmetic
