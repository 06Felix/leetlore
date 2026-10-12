## Idea

- Sort points by decreasing y and increasing x on ties. For each upper-left point, scan later points and count new strictly smaller x values among candidates to its right. Stop once a candidate has equal x.

## Why It Works

- Any previously scanned candidate with x no greater than the current candidate lies on or inside its rectangle and blocks it. Maintaining the smallest such x therefore accepts exactly the unblocked candidates. If equal x is reached, it blocks every later candidate for that starting point.

## Edge Cases

- Equal y values use increasing x to detect horizontal blockers. Equal x values allow the nearest vertical pair and then stop.

## Complexity

- O(n²) time and O(n) worst-case sorting auxiliary space.

## Notes

- The scan matched brute closed-rectangle checks for 456 point sets on a 3×3 coordinate grid. Sorting modifies the input.
