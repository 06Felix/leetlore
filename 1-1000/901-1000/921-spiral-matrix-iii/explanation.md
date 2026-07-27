# Explanation

Problem: [Spiral Matrix III](https://leetcode.com/problems/spiral-matrix-iii/)

## Idea

- Start from `(rStart, cStart)` and record it.
- Walk directions in order east, south, west, north.
- Increase the segment length every two direction changes with `i / 2 + 1`.
- Add a coordinate only when it lies inside the grid.
- Stop when `rows * cols` grid cells have been recorded.

## Why It Works

- A clockwise spiral from the start has step lengths `1, 1, 2, 2, 3, 3, ...`.
- The loop index and direction arrays generate exactly that direction/length pattern.
- Walking outside the grid is allowed by the problem, so out-of-bounds positions are skipped but still advance the spiral path.
- The spiral expands without gaps, so every grid cell is eventually reached and recorded once.

## Edge Cases

- A `1 x 1` grid is handled because the start cell already fills the answer.
- Starts near borders work because out-of-bounds path positions are ignored.

## Complexity

- Time: $O(rows \cdot cols + p)$, where `p` is the skipped outside path length before all cells are collected.
- Space: $O(rows \cdot cols)$ for the answer.

## Notes

- The implementation uses `dx` for columns and `dy` for rows.
