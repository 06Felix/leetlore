# Count of Smaller Numbers After Self

## Idea

- Use a Fenwick tree over shifted value ranks.
- Compute the minimum and maximum input values, then shift every number by `df = -mn + 1`.
- Scan `nums` from right to left.
- For each rank `rk`, query how many inserted ranks are less than `rk`, then insert `rk`.

## Why It Works

- Scanning from right to left means the tree contains exactly the elements to the right of the current index.
- `tree.get(rk - 1)` counts inserted values with smaller rank.
- `tree.add(rk, 1)` makes the current value available for earlier indexes.
- Shifting ranks makes negative numbers usable as positive Fenwick indices.

## Edge Cases

- Equal values are not counted because the query stops at `rk - 1`.
- A single element returns `0`.
- Negative values are handled by coordinate shifting.

## Complexity

- Time: $O(n \log R)$ where `R = max(nums) - min(nums) + 1`.
- Space: $O(R + n)$.

## Notes

- The helper `FW` is declared outside `Solution` in the submitted file.
