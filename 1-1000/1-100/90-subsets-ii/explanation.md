# Subsets II

## Idea

- The implementation sorts `nums` so duplicate values are adjacent.
- DFS adds the current `path` to the answer at every call.
- It then chooses each next element from index `s` onward.
- If a duplicate value appears at the same recursion depth, it is skipped.

## Why It Works

- Every subset corresponds to choosing an increasing sequence of indices.
- Adding `path` before recursing records subsets of every length.
- Sorting makes equal values consecutive, so `i > s && nums[i] == nums[i - 1]` detects duplicate choices for the same position.
- Skipping only same-depth duplicates still allows valid subsets containing multiple copies.

## Edge Cases

- A single-element array returns the empty subset and that one value.
- All-equal arrays produce one subset for each possible count.
- Negative values require no special handling after sorting.

## Complexity

- Time: $O(n \cdot 2^n)$ for copying generated subsets.
- Space: $O(n)$ recursion depth, plus the output.
