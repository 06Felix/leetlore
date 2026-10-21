# Find the Largest Area of Square Inside Two Rectangles

## Idea
- For every pair of rectangles, intersect their x and y coordinate ranges.
- The largest square side in that intersection is the smaller of its width and height. If positive, square it and update the maximum area.

## Why It Works
- The intersection of two axis-aligned rectangles is an axis-aligned rectangle, and a square fitting inside it cannot exceed either dimension.
- A square with the smaller dimension as its side fits, so this bound is attainable for each pair.
- Any square lying in at least two rectangles lies in one tested pair's intersection; maximizing over pairs is sufficient even when more rectangles overlap.

## Edge Cases
- Disjoint rectangles, or those touching only at an edge or point, do not produce positive side length.
- Nested rectangles are handled by the same intersection calculation. `long` coordinates and products safely hold the area.

## Complexity
- $O(n^2)$ time and $O(1)$ auxiliary space.
- Both coordinate arrays are unchanged.
