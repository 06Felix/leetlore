# Explanation

## Idea
- Binary-search the smallest feasible maximum run length.
- For limit one, count flips to each of the two alternating strings and choose the smaller count.
- For a larger limit `k`, sum `runLength / (k + 1)` across original equal-character runs and compare it with the operation budget.

## Why It Works
- A run of length `L` needs at least $\lfloor L/(k+1)\rfloor$ flips, since every group of `k + 1` original equal letters must be broken. For `k >= 2`, internal flips can achieve this count without creating oversized runs across boundaries.
- Limit one requires a globally alternating string, so its two possible patterns are checked separately.
- Feasibility is monotone as the allowed run length increases, making lower-bound binary search valid.

## Edge Cases
- With zero operations, the answer is the existing longest run.
- A singleton always returns one; sufficient flips to reach either alternating pattern also make one feasible.

## Complexity
- Time: $O(n\log n)$ for linear feasibility scans during binary search.
- Auxiliary space: $O(1)$.
