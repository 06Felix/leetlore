# Count Number of Ways to Place Houses

## Idea

- Count valid arrangements for one side of the street.
- For one side, the count follows the Fibonacci recurrence: place no house at the current plot, or place one and force the previous plot empty.
- Square the one-side count because the two sides are independent.

## Why It Works

- Adjacent restrictions only apply on the same side of the street.
- `arr[i] = arr[i - 1] + arr[i - 2]` counts all valid one-side layouts of length `i`.
- Any valid layout on one side can be paired with any valid layout on the other side.

## Edge Cases

- `n = 1` returns `4`.
- `n = 2` returns `9`.
- The recurrence is computed modulo `1_000_000_007` to keep values bounded.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` as implemented.
