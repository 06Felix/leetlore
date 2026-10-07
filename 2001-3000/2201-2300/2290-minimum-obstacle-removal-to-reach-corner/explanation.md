# Explanation

## Idea
- Use a min-heap to explore grid cells by the smallest obstacle cost discovered so far.
- Relax each side-sharing neighbor with `current cost + grid[current row][current column]`, charging the cell being left.
- Return the cost when the target is popped from the heap.

## Why It Works
- All transition costs are zero or one, so Dijkstra's minimum-first ordering yields the least total path cost.
- Charging departed cells counts every obstacle on a path except its destination. Both endpoints are guaranteed zero, so this equals the required obstacle removals.
- Strict distance improvements add candidates to the heap, and the first popped target has the optimal cost.

## Edge Cases
- A fully empty route has cost zero; one-row and one-column grids are supported.
- The zero-cost endpoint guarantee matters: counting the starting value and charging departure would not model arbitrary nonzero endpoints correctly.

## Complexity
- Time: $O(V \log V)$ for $V = RC$ cells and a constant number of neighbors per cell.
- Auxiliary space: $O(V)$ for distances and heap entries.

## Notes
- The implementation uses a heap rather than 0-1 BFS and does not explicitly skip stale heap entries; strict relaxation preserves correctness but can cause extra processing.
