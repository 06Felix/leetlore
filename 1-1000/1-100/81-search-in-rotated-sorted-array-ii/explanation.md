# Search in Rotated Sorted Array II

## Idea

- The solution performs a modified binary search on the rotated array.
- At each step, it checks the middle value first.
- If `nums[l]`, `nums[m]`, and `nums[r]` are equal, duplicates hide the sorted side, so both boundaries are moved inward.
- Otherwise, one half must be sorted, and the code decides whether the target belongs in that half.

## Why It Works

- In a rotated sorted array without ambiguous duplicates, at least one side of `m` is sorted.
- If the target lies within the sorted side's value range, the other side can be discarded.
- If it does not, the target can only be in the other half.
- When equal boundary values make the sorted side unknowable, dropping one equal value from each end cannot remove a unique target because `nums[m]` was already checked.

## Edge Cases

- Arrays with all equal values may degrade to shrinking one step from both ends.
- A target at `m` returns immediately.
- Single-element arrays work through the same loop.

## Complexity

- Average time: $O(\log n)$ when duplicates do not obscure the search often.
- Worst-case time: $O(n)$ with many equal values.
- Space: $O(1)$.
