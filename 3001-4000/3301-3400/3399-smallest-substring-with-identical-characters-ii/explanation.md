# Explanation

## Idea
- Binary-search the smallest feasible maximum run length.
- For limit one, count flips to both alternating patterns. For a larger limit `k`, sum `runLength / (k + 1)` across equal-character runs.

## Why It Works
- Every group of `k + 1` original equal letters needs a flip. For `k >= 2`, each run can achieve the resulting lower bound with internal flips without creating oversized runs across boundaries.
- Limit one requires a globally alternating string, so it is handled separately. Feasibility increases with the allowed run length, permitting lower-bound binary search.

## Edge Cases
- Zero operations returns the existing longest run.
- A singleton or a string convertible to an alternating pattern has answer one.

## Complexity
- Time: $O(n\log n)$ for linear feasibility scans.
- Auxiliary space: $O(1)$.
