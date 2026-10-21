# Maximum Path Quality of a Graph

## Idea
- Build weighted undirected adjacency lists and enumerate all walks starting at zero that fit the remaining time.
- Track visit counts along the current walk. Add a node's value only on its first visit, and update the best quality whenever the walk returns to zero.
- Backtrack visit counts after each recursive branch so sibling walks are evaluated independently.

## Why It Works
- The search follows every affordable next edge, including revisits, so every time-feasible closed walk is considered.
- Visit counts ensure each distinct node contributes exactly once to its walk's quality, even if visited repeatedly.
- Updating the result only at node zero considers precisely valid paths; the initial call also covers staying at zero.

## Edge Cases
- An isolated starting node returns its own value; unreachable components cannot contribute.
- Positive travel times bound recursion depth. With minimum edge time ten and maximum time 100, at most ten edges can be traversed.

## Complexity
- $O(n+E+4^d)$ time for $d=\lfloor maxTime/10\rfloor\le10$, using the maximum degree of four.
- $O(n+E+d)$ auxiliary space for adjacency, visit counts, and recursion.

## Notes
- Instance-reuse bug: `ans` is not reset in `maximalPathQuality`. Calling the same object with one-node values `[10]` and then `[1]` returns `10` on the second call instead of `1`.
- Scores fit in `int` under the time and value bounds: any explored walk visits at most eleven distinct nodes.
