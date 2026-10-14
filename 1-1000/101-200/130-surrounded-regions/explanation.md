## Idea

- DFS from boundary cells, temporarily marking connected O cells as *. Then restore * to O and turn every remaining O into X.

## Why It Works

- A region is safe exactly when an O path reaches the boundary. The first pass marks all and only such cells; the second pass captures the unmarked regions while preserving the safe ones.

## Edge Cases

- Single-row and single-column O cells are all boundary-connected. Marking before recurring prevents revisiting cells.

## Complexity

- O(rows·columns) time and O(rows·columns) worst-case recursive stack.

## Notes

- Runtime risk: a large connected region can make recursive DFS overflow the Java stack. The board is modified in place and temporary markers are removed.
