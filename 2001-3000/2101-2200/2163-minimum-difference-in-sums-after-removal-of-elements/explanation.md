## Idea

- Maintain left minimum sums and right maximum sums with heaps for every split.

## Why It Works

- For a fixed split these independent extrema give the best difference.

## Edge Cases

- Boundary cases are handled directly by the scan or recurrence.

## Complexity

- O(n log n) time, O(n) space.
