# The Skyline Problem

## Idea

- The solution uses divide and conquer.
- A single building produces two key points: its left edge at its height and its right edge at `0`.
- The building list is split in half, each half's skyline is solved recursively, and the two skylines are merged.
- During merge, the visible height is `max(leftY, rightY)`.

## Why It Works

- The skyline of all buildings is the pointwise maximum of the skylines of two disjoint subsets.
- Each recursive call returns a valid skyline for its subset.
- Merging walks key points in x-order while tracking the current height from both sides.
- `addPoint` removes duplicate x-coordinates and avoids consecutive points with the same height.

## Edge Cases

- No buildings returns an empty skyline.
- One building returns its start and end key points directly.
- Adjacent or overlapping buildings with equal visible height are merged by `addPoint`.

## Complexity

- Time: $O(n \log n)$ merge work across divide-and-conquer levels, ignoring array-copy overhead.
- Space: $O(n \log n)$ transient space from recursive `copyOfRange` calls and skyline lists.
