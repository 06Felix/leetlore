# Circle and Rectangle Overlapping

## Idea

- Clamp the circle center’s x and y independently into the rectangle’s coordinate ranges. Compare the squared distance to this closest point with radius squared.

## Why It Works

- Independent coordinate clamping minimizes squared distance to an axis-aligned rectangle. A shared point exists exactly when that minimum distance is no greater than the circle radius.

## Edge Cases

- A center inside the rectangle gives distance zero. Equality accepts tangency at an edge or corner.

## Complexity

- O(1) time and O(1) auxiliary space.

## Notes

- The largest squared-distance sum under the coordinate bounds is 800000000, within int range. No square root is needed.
