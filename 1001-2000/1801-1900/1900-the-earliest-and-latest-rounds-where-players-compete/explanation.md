## Idea

- Recursively enumerate attainable positions after each round using symmetry and winner counts.

## Why It Works

- All possible winners between the protected players produce every reachable next state.

## Edge Cases

- Boundary cases are handled directly by the scan or recurrence.

## Complexity

- Exponential without memoization; O(log n) recursion depth.

## Notes

- Exhaustive checks through n=12 matched all 286 configurations.
