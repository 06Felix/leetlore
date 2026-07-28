# Explanation

## Idea

Count only the first cell of each battleship. A cell is a ship start if it is `X` and there is no `X` directly above it or directly to its left.

## Why It Works

Ships are placed only horizontally or vertically, with no adjacent ships. Therefore every ship has exactly one top-left-most cell.

Every other cell in that same ship has either an `X` above it or an `X` to its left, so it is skipped.

## Edge Cases

- A single-cell ship has no ship cell above or left, so it is counted.
- Empty cells are skipped immediately.
- The board is not modified.

## Complexity

Time: `O(m * n)`.

Space: `O(1)`.
