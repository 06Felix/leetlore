# Count Number of Trapezoids I

## Idea

- Group points by y-coordinate. A row with c points offers c(c - 1)/2 horizontal segments. Accumulate the products of segment counts from different rows using a running sum, reducing modulo 1000000007.

## Why It Works

- Choosing two distinct horizontal rows and one segment from each creates a convex quadrilateral with horizontal opposite sides. Every horizontal trapezoid has exactly this representation, and multiplying by the preceding-row total counts each row pair once.

## Edge Cases

- Rows with fewer than two points contribute no segment. Different x-ranges on the two rows are still valid because parallel segments on distinct lines form a convex trapezoid.

## Complexity

- Expected O(n) time and O(n) auxiliary space for the HashMap and segment-count list.

## Notes

- The map’s row order is irrelevant to the pairwise-product sum. Counts and modular products use long to avoid int overflow.
