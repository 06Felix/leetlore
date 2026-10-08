# Explanation

## Idea
- Enumerate the column where the first robot moves down.
- Maintain the uncollected top-row suffix and bottom-row prefix, and minimize the larger of their sums.

## Why It Works
- The first path clears the top prefix through its turning column and the bottom suffix from that column onward.
- The second robot can collect the remaining top suffix or bottom prefix, but cannot collect both with right/down movement. Positive values make taking an entire remaining segment optimal.
- Every first path has exactly one turning column, so taking the minimum over them solves the game.

## Edge Cases
- A one-column grid leaves no points for the second robot.
- The top suffix is updated before evaluation and the bottom prefix afterward, excluding both cleared turning-column cells.

## Complexity
- Time: $O(n)$ for the initial sum and turning-column scan.
- Auxiliary space: $O(1)$; sums use `long`.
