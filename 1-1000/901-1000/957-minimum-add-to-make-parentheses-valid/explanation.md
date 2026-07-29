# Explanation

## Idea

- Scan the string once.
- `l` counts unmatched opening parentheses.
- `r` counts unmatched closing parentheses that need an inserted opening parenthesis.
- For `(`, increment `l`.
- For `)`, match an existing `(` if possible; otherwise increment `r`.

## Why It Works

- Every unmatched `)` must be fixed by inserting a `(` before it.
- Every unmatched `(` left after the scan must be fixed by inserting a `)` after it.
- Greedily matching each `)` with the most recent available `(` never hurts, because valid parentheses only need balanced order.
- Therefore `l + r` is exactly the minimum insertions needed.

## Edge Cases

- All opening parentheses return their count.
- All closing parentheses return their count.
- Already valid strings end with both counters at zero.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
