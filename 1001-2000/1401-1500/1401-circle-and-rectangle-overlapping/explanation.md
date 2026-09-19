# Circle and Rectangle Overlapping

## Idea

- Find the point inside the rectangle that is closest to the circle center.
- Clamp the circle center's `x` coordinate into `[x1, x2]`.
- Clamp the circle center's `y` coordinate into `[y1, y2]`.
- If that closest point is within the circle radius, the two shapes overlap.

## Why It Works

- For an axis-aligned rectangle, the closest rectangle point to any outside point is found by clamping each coordinate independently.
- If the circle center is already inside the rectangle on one axis, that coordinate stays unchanged.
- The circle overlaps the rectangle exactly when the squared distance to this closest point is at most `radius * radius`.

## Edge Cases

- If the circle center is inside the rectangle, the closest point is the center itself, so the answer is `true`.
- Touching at one point still counts as overlap, so the comparison uses `<=`.
- Corners and edges are handled by the same clamping logic.

## Complexity

- Time: `O(1)`
- Space: `O(1)`

## Tags

- Geometry
- Math
