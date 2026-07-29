# Perfect Rectangle

## Idea

- Track the bounding rectangle formed by the minimum and maximum coordinates.
- Sum the area of every small rectangle.
- Toggle each rectangle corner in a set: add it the first time, remove it the second time.
- A perfect cover must leave exactly the four bounding corners and have equal total area.

## Why It Works

- In an exact tiling, every internal corner appears an even number of times and cancels out in the toggle set.
- Only the four outer corners should remain after all toggles.
- Matching total area rules out gaps or overlaps that might otherwise leave the same outer corners.

## Edge Cases

- Overlaps increase summed area and fail the final area check.
- Gaps either change the remaining corner set or make the area smaller than the bounding rectangle.
- Shared edges are valid because their endpoints are toggled an even number of times.

## Complexity

- Time: `O(n)`, where `n` is `rectangles.length`.
- Space: `O(n)` for the corner set.

## Notes

- The implementation uses `int` for area. Given coordinate and rectangle count constraints, a `long` accumulator would be safer against overflow, though the existing submitted code is left unchanged.
