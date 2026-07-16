# Custom Sort String

## Idea

- The solution counts every character in `s`.
- It appends characters that appear in `order` first, following `order` exactly.
- Each ordered character is appended as many times as it appears in `s`.
- Remaining lowercase characters are appended afterward.

## Why It Works

- The only required ordering constraints are between characters present in `order`.
- Emitting those characters in `order` satisfies all custom ordering constraints.
- Characters not in `order` may appear anywhere, so appending them after the ordered characters is valid.
- Decrementing counts ensures every character from `s` is emitted exactly once.

## Edge Cases

- Characters in `order` that do not appear in `s` append nothing.
- Characters in `s` but not in `order` are appended in normal alphabetic order.
- Repeated characters in `s` are handled by counts.

## Complexity

- Time: $O(|s| + 26)$.
- Space: $O(1)$ for the fixed count array, plus output.
