# Explanation

## Idea

- Mark which values appear in `nums1` and `nums2` using two fixed arrays.
- Count each index in `nums1` whose value is marked in `nums2`.
- Count each index in `nums2` whose value is marked in `nums1`.

## Why It Works

- Values are bounded by `1..100`, so direct value-indexed presence arrays are sufficient.
- The requested answers count indices, not distinct values.
- Adding the presence marker for each element counts every qualifying index exactly once.

## Edge Cases

- Duplicate values are counted multiple times by index.
- No shared values returns `[0, 0]`.
- Fixed arrays cover the full value range.

## Complexity

- Time: $O(n + m)$.
- Space: $O(1)$.
