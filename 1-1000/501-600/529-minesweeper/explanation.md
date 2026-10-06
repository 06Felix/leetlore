# Explanation

## Idea
- A clicked mine becomes `X` immediately. Otherwise, recursively process unrevealed empty cells.
- Count mines in all eight neighboring positions, writing a digit when the count is positive.
- If there are no neighboring mines, mark the cell `B` and recursively reveal all eight neighbors.

## Why It Works
- A numbered cell terminates expansion exactly where the rules require it.
- A blank cell expands to every adjacent unrevealed square, revealing the complete reachable blank region and its numbered boundary.
- Changing a cell before recursion prevents repeated processing; the guard skips mines, already revealed cells, and positions outside the board.

## Edge Cases
- Borders and corners count only in-bounds neighbors.
- Mine clicks do not expand; the mine counter recognizes both `M` and `X` as mines.

## Complexity
- Time: $O(mn)$ worst case, since each processed cell checks only eight neighbors.
- Auxiliary space: $O(mn)$ worst-case recursion stack; the board is modified in place.

## Notes
- Large connected empty regions depend on sufficient recursion stack capacity.
