# Explanation

## Idea

Initialize the matrix with `-1`, then walk in spiral order while consuming linked-list nodes.

The direction order is right, down, left, up. Before moving, the code turns to the next direction if the next cell is outside the matrix or already filled.

## Why It Works

Filled cells are no longer available because they are not `-1`. Boundary checks prevent leaving the matrix.

This means the walk follows the current ring until blocked, then rotates clockwise into the next ring. Each linked-list value is written to exactly one visited cell.

Unvisited cells remain `-1`, matching the required fill value.

## Edge Cases

- A short linked list leaves remaining cells as `-1`.
- Single-row or single-column matrices work through the same direction checks.
- The implementation's indentation is misleading: only the direction update is conditional; the position advances every iteration.

## Complexity

Time: `O(m * n)`.

Space: `O(m * n)` for the returned matrix.
