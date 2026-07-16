# Intersection of Two Arrays

## Idea

- The implementation inserts all values from `nums1` into a set.
- It scans `nums2` and checks whether each value is in that set.
- When a match is found, it adds the value to the answer list and removes it from the set.
- The list is converted to an array at the end.

## Why It Works

- The set gives constant-time membership checks for values from `nums1`.
- A value in both arrays should appear in the intersection.
- Removing a matched value prevents duplicate output.
- The problem allows any result order.

## Edge Cases

- Duplicate values in either input still produce one output value.
- No overlap returns an empty array.
- Values are small but the set-based approach works for any integer range.

## Complexity

- Time: $O(m + n)$.
- Space: $O(m)$ for the set.
