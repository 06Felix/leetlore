# Explanation

## Idea

- Scan every cell looking for an unvisited farmland cell.
- From that top-left cell of a group, DFS through farmland using down and right moves.
- Track the maximum row and column reached as the group's bottom-right corner.

## Why It Works

- Groups are rectangular and no two groups touch, so the first unvisited `1` found by row-major scan is the top-left corner of one group.
- Moving only down and right is enough to cover that rectangle from its top-left cell.
- Marking visited farmland as `0` prevents reporting the same group again.
- The maximum row and column reached identify the bottom-right corner.

## Edge Cases

- A single-cell group records identical top-left and bottom-right coordinates.
- A matrix with no farmland returns an empty array.
- Multiple separated rectangles are collected independently.

## Complexity

- Time: $O(mn)$.
- Space: $O(mn)$ worst-case recursion depth for one large group.
