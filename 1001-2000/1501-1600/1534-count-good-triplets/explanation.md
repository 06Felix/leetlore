# Count Good Triplets

## Idea
- Enumerate every ordered index triple with three nested loops.
- Count a triple only when all three absolute-difference bounds hold.

## Why It Works
- The loop bounds enforce $i<j<k$ and visit every eligible triple exactly once.
- Checking the three stated inequalities directly accepts exactly the good triplets.

## Edge Cases
- Equal values at different indices remain separate triples; zero thresholds require the relevant values to match.
- Absolute differences and the maximum number of triples fit `int` under the stated limits.

## Complexity
- Time: $O(n^3)$, practical for $n\le100$.
- Space: $O(1)$ auxiliary storage.
