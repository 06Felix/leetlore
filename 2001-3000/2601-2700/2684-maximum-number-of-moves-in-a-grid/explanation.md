# Explanation

## Idea
- Start a depth-first search from every first-column cell, following the three rightward directions only when the next value is larger.
- Share a visited table across all starts so each reachable cell is expanded once.
- Update the best move count whenever an attempted continuation leaves the grid or violates the increasing-value rule.

## Why It Works
- Every valid path advances exactly one column per move, so all arrivals at a given cell have the same number of moves. Revisiting it cannot improve its continuation.
- The value guard runs before the visited check, so an invalid arrival never marks a cell as reached.
- The initial count is `-1`; each accepted cell increments it before trying its successors. A failed continuation therefore reports the number of successful moves to its last accepted cell.

## Edge Cases
- If every first move is blocked, failed continuations report zero.
- Boundary rows, paths reaching the last column, and equal-value neighbors follow the same guards.

## Complexity
- Time: $O(RC)$ for an `R`-row, `C`-column grid.
- Auxiliary space: $O(RC)$ for visited cells plus $O(C)$ recursion depth.

## Notes
- The `ans` field is not reset at method entry, so reusing one instance for another grid can retain an earlier larger answer.
