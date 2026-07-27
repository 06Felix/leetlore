# Explanation

## Idea

DFS every island in `grid2`. During traversal, mark visited land as `2` and return whether every cell in that island also has land in `grid1`.

The main loop adds the DFS result for each unvisited `grid2` island.

## Why It Works

A `grid2` island is a sub-island only if all of its cells overlap land in `grid1`.

The DFS visits the entire connected island and combines all recursive results with bitwise `&`, also including `grid1[i][j]` for the current cell. If any cell sits on water in `grid1`, the whole island returns `0`.

Using bitwise `&` instead of short-circuit `&&` ensures all neighboring cells are still visited and marked.

## Edge Cases

- Water and out-of-bounds positions return `1` because they do not invalidate an island.
- Islands touching the boundary are handled by the bounds checks.
- `grid2` is mutated to avoid revisiting cells.

## Complexity

Time: `O(m * n)`.

Space: `O(m * n)` worst-case recursion stack.
