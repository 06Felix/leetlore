# Explanation

## Idea
- `dp[i][jump]` means a jump of that length is allowed from stone `i` after some valid route reaches it.
- Seed only jump length 1 at the starting stone. For each earlier stone, test whether its allowed jump lands on the current stone.
- A successful arrival of length `diff` enables outgoing lengths `diff - 1`, `diff`, and `diff + 1`.

## Why It Works
- The seed enforces the required first jump. Every transition lands on an actual later stone and follows the permitted change in jump length.
- Processing stones in order considers every possible predecessor before its reachable outgoing lengths are needed.
- Returning when a transition reaches the last stone exactly matches successful crossing.

## Edge Cases
- If the second stone is not at position 1, no initial transition is possible.
- Zero-length entries are harmless because all tested stone differences are positive. Lengths beyond `n` can be skipped: a route has at most $n-1$ jumps and increases its jump length by at most one each time.

## Complexity
- Time: $O(n^2)$ for all predecessor pairs.
- Auxiliary space: $O(n^2)$ for the table.
