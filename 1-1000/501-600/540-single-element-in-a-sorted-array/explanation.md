# Single Element in a Sorted Array

## Idea

- The solution binary-searches on pair boundaries.
- It forces `m` to be even so `m` and `m + 1` can represent an expected pair start.
- If `nums[m] == nums[m + 1]`, all elements through that pair are normal, so the single element is to the right.
- Otherwise the disruption starts at or before `m`, so the search moves left.

## Why It Works

- Before the single element, pairs start at even indices.
- After the single element, pair alignment shifts by one.
- Checking an even index tells which side of the single element the midpoint is on.
- When the range collapses, the remaining index holds the single element.

## Edge Cases

- A one-element array skips the loop and returns that element.
- The single element at the start makes the first pair check fail and moves left.
- The single element at the end keeps moving the left boundary right.

## Complexity

- Time: $O(\log n)$.
- Space: $O(1)$.
