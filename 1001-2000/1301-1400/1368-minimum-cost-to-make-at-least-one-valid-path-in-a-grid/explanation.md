# Explanation

## Idea
- Recursively follow existing arrows from a cell to discover its entire zero-cost closure, marking and enqueuing new cells.
- Begin with the closure from the top-left cell. For each next cost layer, try all four neighbors of the current queue layer and discover their zero-cost closures.

## Why It Works
- Following a cell's arrow costs zero; choosing another neighboring direction costs one modification.
- Free closures are exhausted before the next cost layer, so first discovery gives minimum modification cost. A matching-arrow neighbor is already visited and cannot spuriously require payment.
- Nonnegative costs allow a minimum path without repeated cells, satisfying the restriction of changing any cell at most once.

## Edge Cases
- A one-cell grid or an existing valid arrow path returns zero.
- Out-of-grid arrows and cycles terminate through bounds and visited checks.

## Complexity
- Time: $O(mn)$; each cell is discovered once and explores four neighbors.
- Auxiliary space: $O(mn)$ for the visited grid, queue, and worst-case recursion depth.

## Notes
- A long arrow-following chain can recurse through up to 10000 cells, risking Java stack overflow. The imported recursive implementation is preserved.
- The helper's `cost` argument is unused; the outer BFS layer counter supplies the returned cost.
