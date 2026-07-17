# Explanation

## Idea

- Allocate a result matrix with the same dimensions.
- For each cell, inspect the surrounding `3 x 3` coordinate range.
- Sum only coordinates inside the image and divide by the count.

## Why It Works

- The smoother average uses the cell itself plus valid neighboring cells.
- Boundary checks exclude missing neighbors on edges and corners.
- Integer division floors the average, matching the required rounded-down value.

## Edge Cases

- Single-cell images average only that cell.
- Edge and corner cells use fewer than nine values.
- The original image is not modified while computing later cells.

## Complexity

- Time: $O(mn)$ because each cell checks at most nine positions.
- Space: $O(mn)$ for the result matrix.
