# Spiral Matrix II

## Idea

- The solution fills the matrix one square layer at a time.
- For each layer `st`, `end = n - st - 1` is the opposite boundary.
- It writes the top row, right column, bottom row, and left column in order, increasing the next value after every cell.
- If `n` is odd, the center cell remains after all full layers and is filled separately.

## Why It Works

- Each loop writes exactly the perimeter of the current layer.
- The four directional loops avoid reusing corners by stopping before the next side's starting cell.
- Moving `st` inward after each layer covers every non-center cell once.
- The center assignment handles the only cell not included in any perimeter when `n` is odd.

## Edge Cases

- `n = 1` skips the layer loop and writes the center cell.
- Even `n` has no center cell and is fully handled by the layer loop.
- The constraints are small, so direct matrix filling is appropriate.

## Complexity

- Time: $O(n^2)$.
- Space: $O(n^2)$ for the returned matrix.
