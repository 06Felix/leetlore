# Map of Highest Peak

## Idea
- Set every water cell's height to zero and enqueue all of them. Initialize land heights to `-1` as unvisited markers.
- Run a multi-source BFS over four-neighbor moves, assigning each newly reached cell one plus its predecessor's height.

## Why It Works
- BFS assigns each cell its shortest grid distance to any water cell.
- Any valid assignment is bounded above by that distance because height can increase by at most one per step from height-zero water.
- Distance values are nonnegative and differ by at most one across adjacent cells, so they form a valid assignment attaining every cell's upper bound and therefore the maximum possible peak.

## Edge Cases
- An all-water grid stays at zero; a single water source spreads across the whole grid.
- One-row and one-column grids use the same bounds checks. The guaranteed water source ensures all cells are reached.

## Complexity
- $O(mn)$ time and $O(mn)$ queue space, plus the output height matrix.
- The input matrix is unchanged.
