# Consecutive Characters

## Idea

- Track the length `ct` of the current run of equal characters.
- Reset `ct` to `1` when the current character differs from the previous one.
- Keep `ans` as the maximum run length seen.

## Why It Works

- The power of the string is exactly the longest contiguous run of one repeated character.
- Comparing each character with the previous one updates the current run length correctly.
- Taking the maximum after each update records the best run over the whole string.

## Edge Cases

- A one-character string returns `1`.
- Runs at the end are counted because `ans` is updated during every iteration.
- Alternating characters keep `ct` reset to `1`.

## Complexity

- Time: `O(n)`, where `n` is `s.length()`.
- Space: `O(1)`.
