# Minimum Operations to Exceed Threshold Value I

## Idea

- The operation removes one occurrence of the current smallest value.
- The final array must contain only values greater than or equal to `k`.
- The solution simply counts how many elements are less than `k`.
- Each such element must be removed exactly once.

## Why It Works

- Any element below `k` cannot remain in the final array.
- Removing smaller elements first is consistent with the operation rule.
- Elements already at least `k` never need to be removed.
- Therefore the minimum number of operations equals the count of elements below `k`.

## Edge Cases

- If all elements already meet the threshold, the count is `0`.
- The input guarantees at least one element is at least `k`, so the process can stop with a non-empty valid array.
- Duplicate small values are counted independently.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
