# Minimum Moves to Convert String

## Idea

- Scan the string from left to right.
- If the current character is already `O`, move one step.
- If it is `X`, use one move covering this position and the next two positions, then skip three characters.

## Why It Works

- The leftmost remaining `X` must be covered by some move.
- Starting that move at the current index covers the leftmost `X` and reaches as far right as possible.
- Skipping the covered three positions is safe because they are all converted to `O`.

## Edge Cases

- A string with no `X` returns `0`.
- `X` near the end is still handled by counting one move and advancing past the string.
- Existing `O` characters inside a chosen block do not matter because converting them keeps them `O`.

## Complexity

- Time: `O(n)`, where `n` is `s.length()`.
- Space: `O(1)`.
