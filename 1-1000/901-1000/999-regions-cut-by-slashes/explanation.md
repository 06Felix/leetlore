# Explanation

Problem: [Regions Cut By Slashes](https://leetcode.com/problems/regions-cut-by-slashes/)

## Idea

- Expand each original cell into a `3 x 3` block.
- Mark the pixels occupied by `/` or `\` as blocked.
- Run DFS over every unblocked pixel in the expanded grid.
- Count how many connected unblocked components exist.

## Why It Works

- Expanding to `3 x 3` gives each slash enough resolution to separate the cell diagonally.
- Marked slash pixels behave as walls, so unblocked pixel connectivity matches region connectivity in the original grid.
- Each DFS visits exactly one connected region of open space.
- Starting a new DFS only from an unvisited open pixel counts each region once.

## Edge Cases

- Blank cells leave their full `3 x 3` block open.
- Adjacent slashes connect through shared expanded-grid boundaries naturally.

## Complexity

- Time: $O(n^2)$ because the expanded grid has `9n^2` pixels.
- Space: $O(n^2)$ for the expanded grid and DFS recursion.

## Notes

- The solution marks blocked cells as `1` and visited open cells as `2`.
