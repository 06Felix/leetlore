## Idea

- Recursively track the two protected players’ positions and the current player count. Mirror the row when useful, then enumerate attainable positions after one round by counting winners in the relevant regions. Take the minimum and maximum child rounds plus one.

## Why It Works

- Opposite positions meet immediately. Otherwise both protected players survive, and the next row has ceil(n/2) players in original order. When both are in the left half, winner counts before and between them determine their next positions. When they straddle the midpoint, the region between the second player and its mirrored opponent contributes a fixed number of survivors. Enumerating the remaining winner counts covers every reachable next-position pair; recursion therefore finds both extrema.

## Edge Cases

- The middle player receives a bye when n is odd. Reflection preserves the tournament and meeting round.

## Complexity

- Without memoization, repeated states are recomputed: a conservative bound is T(n)=O(n²)T(ceil(n/2))+O(n²). Recursion uses O(log n) auxiliary stack space.

## Notes

- The recurrence matched exhaustive round-outcome enumeration for all 286 player configurations with 2≤n≤12. This implementation does not cache repeated recursive states.
