# Widest Vertical Area Between Two Points Containing No Points

## Idea

- Extract only the x-coordinate from every point.
- Sort the x-coordinates.
- The widest empty vertical area is the largest gap between adjacent sorted x-values.

## Why It Works

- A vertical area's width depends only on x-coordinates; y-coordinates do not matter.
- Any gap between adjacent sorted x-values has no point strictly inside it by definition.
- A wider area with no points inside must be bounded by two neighboring x-values in sorted order.

## Edge Cases

- Duplicate x-coordinates produce gap `0`.
- Points on the boundary are allowed, so adjacent x-values are valid boundaries.
- The answer is initialized to `0`, which handles all points sharing the same x-coordinate.

## Complexity

- Time: `O(n log n)` for sorting.
- Space: `O(n)` for the extracted x-coordinate array.
