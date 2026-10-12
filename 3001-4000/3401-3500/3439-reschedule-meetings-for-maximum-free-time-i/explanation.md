## Idea

- Compute gaps and maximize every window of k+1 consecutive gaps.

## Why It Works

- Moving k meetings merges exactly those surrounding gaps while preserving order.

## Edge Cases

- Boundary cases are handled directly by the scan or recurrence.

## Complexity

- O(n) time, O(n) space.
