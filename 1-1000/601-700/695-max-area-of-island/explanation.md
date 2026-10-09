## Idea
- Scan for a land cell, then DFS through its four-directional island.
- Erase each visited cell and return one plus the areas found through its neighbors. Keep the largest returned area.

## Why It Works
- Marking a cell before exploring neighbors prevents cycles and duplicate counting.
- A DFS therefore counts each cell in exactly one connected island, and the outer scan compares all island areas.

## Edge Cases
- With no land, the initial answer zero is returned.
- Diagonally touching cells belong to different islands; a single connected land region returns its full size.

## Complexity
- O(mn) time, with each cell inspected and each land cell visited once.
- O(mn) worst-case auxiliary space for recursion.

## Notes
- The input grid is mutated by changing visited ones to zeros.
- Recursive depth can reach the island size, up to 2,500 cells, and depends on the available Java stack.
