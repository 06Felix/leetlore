# Explanation

## Idea

Check whether `original.length == m * n`. If not, no valid matrix can use every element exactly once.

Otherwise, fill an `m x n` matrix row by row from the original array.

## Why It Works

The required construction maps `original[id]` to row `id / n` and column `id % n`. The nested loops produce that same order by advancing one index while moving left to right, top to bottom.

If the sizes differ, either some original elements would be unused or some matrix cells could not be filled.

## Edge Cases

- Exact one-row and one-column conversions work through the same loops.
- Impossible dimensions return an empty 2D array.

## Complexity

Time: `O(m * n)`.

Space: `O(m * n)` for the returned matrix.
