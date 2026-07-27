# Explanation

## Idea

DFS the connected component starting at `(row, col)`. The implementation temporarily marks visited component cells by negating their original color.

After DFS, cells still negative are border cells and are recolored.

## Why It Works

Every same-color reachable cell is visited once. A visited cell starts as negative, meaning it is assumed to be border.

After visiting neighbors, an interior cell is recognized when it is not on the grid boundary and all four neighbors still belong to the same original component. Such a cell is restored to the original color.

Only true border cells remain negative and are changed to the requested color in the final scan.

## Edge Cases

- Boundary cells are always borders.
- `Math.abs` allows already-marked neighbors to count as part of the component.
- If `color` equals the original color, the final grid remains effectively unchanged.

## Complexity

Time: `O(m * n)`.

Space: `O(m * n)` for visited state and recursion stack in the worst case.
