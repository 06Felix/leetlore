# Minimum Difference Between Largest and Smallest Value in Three Moves

## Idea

- If there are at most four numbers, change all but one and return `0`.
- Sort the array.
- After three moves, only four patterns matter: change `3` smallest, `2` smallest and `1` largest, `1` smallest and `2` largest, or `3` largest.
- Compute the remaining max-min difference for each pattern and take the minimum.

## Why It Works

- Changing an interior value cannot reduce the final range more than changing an extreme value.
- With three moves, we remove the effect of exactly three extremes from the sorted order.
- Pattern `i` keeps the range from `nums[i]` to `nums[n - 4 + i]`.
- The best among the four choices is the minimum possible range.

## Edge Cases

- `n <= 4` can always become all equal.
- Negative values sort and subtract correctly.
- Duplicate extremes naturally produce smaller differences.

## Complexity

- Time: $O(n \log n)$ from sorting.
- Space: $O(1)$ extra besides sorting implementation details.
