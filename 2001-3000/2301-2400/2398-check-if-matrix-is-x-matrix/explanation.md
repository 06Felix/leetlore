# Check if Matrix Is X-Matrix

## Idea

- Visit every cell in the square grid.
- A cell belongs to the main diagonal when `i == j`.
- A cell belongs to the anti-diagonal when `i + j == n - 1`.
- Diagonal cells must be nonzero, and all other cells must be zero.

## Why It Works

- The two diagonal tests identify exactly the cells that form the X shape.
- The implementation checks the required value condition immediately for each cell based on that classification.
- Any violation proves the grid is not an X-matrix, so returning `false` early is correct.

## Edge Cases

- The center cell of odd-sized matrices lies on both diagonals and is still only required to be nonzero.
- Zero on either diagonal fails even if the rest of the grid is valid.
- Nonzero values outside both diagonals fail immediately.

## Complexity

- Time: `O(n^2)` for scanning all cells.
- Space: `O(1)`.
