# Check if Grid can be Cut into Sections

## Idea
- Project rectangles onto the x-axis and y-axis, then sort each set of intervals by its starting coordinate.
- Count groups joined by strict overlap; return true if either axis has at least three groups.

## Why It Works
- Strictly overlapping projections cannot be separated by a cut perpendicular to that axis without crossing a rectangle's interior.
- Touching projections form separate groups because a cut may lie on their shared boundary.
- Three or more nonempty groups provide two separating cuts; fewer than three cannot yield three sections containing rectangles.

## Edge Cases
- Nested projections extend the current group's endpoint using `max`; touching endpoints start a new group.
- Only one axis needs to work. The grid size is unused because all coordinates already satisfy the grid bounds.

## Complexity
- Time: $O(r\log r)$ for $r$ rectangles and two interval sorts.
- Space: $O(r)$ for projected intervals and sorting workspace.
