## Idea

- Update each grid cell to its minimum path cost from the origin, using its upper or left predecessor. Initialize the first row and column from their sole available predecessor.

## Why It Works

- Every permitted path enters a cell from above or left. Adding its value to the smaller predecessor cost gives the optimal cost by induction in row-major order.

## Edge Cases

- A one-cell grid retains its cost; single-row or single-column grids have one route.

## Complexity

- O(rows·columns) time and O(1) auxiliary space.

## Notes

- The grid is modified in place to store DP costs.
