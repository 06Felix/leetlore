# Explanation

## Idea

- Track the largest value, its index, and the second-largest value.
- Scan the array once.
- After the scan, verify whether the largest value is at least twice the second largest.

## Why It Works

- The largest element only needs to be compared against the largest of all other elements.
- If it is at least twice the second largest, it is at least twice every smaller value too.
- Tracking `ans` when `max` changes preserves the original index of the largest value.

## Edge Cases

- If the largest is not dominant, return `-1`.
- Arrays with zeroes work because `secondMax` starts at `0`.
- The largest value is unique by constraint.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
