# Escape the Spreading Fire

## Idea

- Binary search the waiting time from `-1` to `m * n`.
- For a candidate wait, clone the grid and spread fire for that many minutes.
- Then simulate the person and fire with BFS queues.
- If the destination can be reached for a wait, try a larger wait; otherwise try smaller.

## Why It Works

- If a certain waiting time is feasible, any smaller waiting time is also feasible, so binary search applies.
- BFS spreads fire and person movement level by level, matching minute-by-minute expansion.
- Walls and already-filled cells are skipped because movement only enters cells with value `0`.
- Returning `1e9` when `m * n` minutes is feasible represents unbounded waiting.

## Edge Cases

- If the fire reaches the safehouse during the initial wait, the check fails.
- The safehouse is treated specially: reaching it at the same minute as fire is accepted.
- Impossible grids leave the binary search answer at `-1`.

## Complexity

- Time: $O(mn \log(mn))$ because each feasibility check copies and scans the grid by BFS.
- Space: $O(mn)$ for the copied grid and queues.

## Notes

- The submitted simulation enqueues the start cell even if it burned during the initial waiting period. That is a correctness risk for cases where fire reaches `(0, 0)` before departure.
