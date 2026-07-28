# Minimum Number of Flips to Convert Binary Matrix to Zero Matrix

## Idea

- Encode the matrix as a bitmask, with one bit per cell.
- Use BFS over matrix states, starting from the initial mask.
- From each state, try flipping each cell and its four neighbors to generate the next states.

## Why It Works

- Each BFS edge represents exactly one allowed flip operation.
- BFS explores states by increasing number of flips, so the first time mask `0` is reached is the minimum number of steps.
- The `seen` set prevents revisiting states and keeps the finite state graph bounded.

## Edge Cases

- If the initial mask is `0`, the answer is immediately `0`.
- Boundary checks skip neighbors outside the matrix.
- If BFS exhausts all reachable states without finding `0`, conversion is impossible.

## Complexity

- Time: `O(mn * 2^(mn))`; here `mn <= 9`.
- Space: `O(2^(mn))` for the queue and seen set.
