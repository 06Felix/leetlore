# H-Index II

## Idea

- The citations array is already sorted in ascending order.
- The implementation binary-searches the first index `m` where `citations[m] >= n - m`.
- At index `m`, there are `n - m` papers with at least `citations[m]` citations.
- The returned h-index is `n - l`.

## Why It Works

- For any index `i`, the number of papers from `i` to the end is `n - i`.
- If `citations[i] >= n - i`, then those `n - i` papers each have enough citations for h-index `n - i`.
- The predicate becomes true and stays true as `i` moves right in a sorted array.
- Binary search finds the leftmost true position, maximizing `n - i`.

## Edge Cases

- If no citation count is high enough, `l == n` and the answer is `0`.
- If every paper supports the h-index, `l == 0` and the answer is `n`.
- Single-paper arrays are handled by the same search.

## Complexity

- Time: $O(\log n)$.
- Space: $O(1)$.
