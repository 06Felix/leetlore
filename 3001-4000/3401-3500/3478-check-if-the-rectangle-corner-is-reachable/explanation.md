# Explanation

## Idea

Model circles and rectangle boundaries with a disjoint set. Circles that overlap or touch are unioned, and circles that touch a boundary are unioned with that boundary node.

After all unions, a connected blocked chain between certain boundary pairs means no valid path can pass from the bottom-left corner to the top-right corner.

## Why It Works

Overlapping circles form one continuous forbidden region. If that region connects opposite or corner-blocking boundaries, it separates the rectangle so the path cannot cross without touching a circle.

The code checks the boundary connections that block the source corner, the target corner, or create a separating wall across the rectangle.

## Edge Cases

- Circles completely outside relevant parts of the rectangle are skipped by the implementation's filters.
- Touching counts as blocked because the path cannot touch a circle.
- `long` would be safer for squared distance, but this code uses `double` distance from coordinate differences within the problem range.

## Complexity

Time: `O(c^2 * alpha(c))`, where `c` is the number of circles.

Space: `O(c)`.

## Notes

The boundary variable names are partly swapped by y-direction usage, but the final connectivity checks still compare the blocking boundary pairs used by the implementation.
