## Idea

- Sort points by decreasing y, breaking ties by increasing x. For every later point, check that its x is at least the first point’s x and scan every other point for inclusion in the closed rectangle.

## Why It Works

- Sorting ensures the first point is at least as high as the second and orders horizontal pairs correctly. The x test establishes the upper-left relation. Rejecting every pair containing a third point on or inside the boundary exactly enforces the empty-fence condition.

## Edge Cases

- Horizontal and vertical lines are valid. Boundary points block a pair just as interior points do.

## Complexity

- O(n³) time and O(n) worst-case sorting auxiliary space.

## Notes

- Sorting changes the input point order.
