## Idea
- Backtrack at the first unfilled position, trying unused numbers from n down to one.
- Place one once; for any larger value v, also fill the slot v positions later if it is available. Undo both placements when the branch fails.
- Stop at the first fully filled sequence.

## Why It Works
- Placing each pair together enforces the exact required distance, and used flags enforce occurrence counts.
- At the first position where valid answers can differ, the search tries larger values first. Exhausting each larger candidate before a smaller one makes the first complete answer lexicographically largest.

## Edge Cases
- n = 1 yields [1].
- Occupied positions from earlier paired placements are skipped; out-of-range or occupied partner slots reject a candidate before recursion.

## Complexity
- Exponential search; O(n² n!) is a conservative worst-case time bound for the candidate-order search tree and per-branch scanning/skipping.
- O(n) auxiliary space for the result, used flags, and recursive stack.
