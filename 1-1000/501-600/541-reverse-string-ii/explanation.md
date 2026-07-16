# Reverse String II

## Idea

- The string is converted to a character array for in-place swaps.
- The loop advances in blocks of `2k`.
- In each block, it reverses the first `k` characters, or all remaining characters if fewer than `k` remain.
- The rest of each `2k` block is left unchanged.

## Why It Works

- The problem's operation repeats every `2k` characters from the start.
- Reversing from `i` to `min(i + k - 1, n - 1)` exactly covers the required prefix of each block.
- The two-pointer swap reverses that segment in place.
- Advancing by `2k` skips the untouched part and reaches the next block.

## Edge Cases

- If fewer than `k` characters remain, `r` becomes the last index and all remaining characters are reversed.
- If between `k` and `2k` characters remain, only the first `k` are reversed.
- `k = 1` leaves the string unchanged.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the character array.
