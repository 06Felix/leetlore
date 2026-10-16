# Projection Area of 3D Shapes

## Idea

- Count positive cells for the top projection. For each index, add the maximum height in that row and in that column for the two side projections.

## Why It Works

- A tower contributes one top-view cell exactly when its height is positive. Along a fixed row or column, overlapping side shadows extend only to the tallest tower, so the maxima give exactly the remaining projection areas.

## Edge Cases

- An all-zero grid contributes zero. Empty cells are excluded from the top view.

## Complexity

- O(n^2) time and O(1) auxiliary space.

## Notes

- The row and column scans share one inner loop; the input grid is unchanged.
