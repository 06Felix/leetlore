## Idea

- Start at both ends of the sorted array. Increase the left pointer when the sum is too small, decrease the right pointer when too large, and return matching one-based indices.

## Why It Works

- If the endpoint sum is too small, no smaller partner works with the left endpoint. If too large, no larger partner works with the right endpoint. Each move therefore discards only impossible pairs, preserving the guaranteed solution.

## Edge Cases

- The pointers stay distinct. Negative values and equal values at different indices are supported.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The fallback [6,7] is unreachable under the exactly-one-solution guarantee.
