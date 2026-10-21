# Combinations

## Idea
- Backtrack over increasing choices from `1` through `n`, keeping the current combination in a mutable list.
- After selecting `cur`, recurse starting at `cur + 1` with one fewer number needed. Copy the path into `ans` when none remain.

## Why It Works
- Strictly increasing choices use each number at most once and prevent permutations of the same combination.
- Every sorted combination has exactly one sequence of choices in the search, and copying the completed path preserves it during later backtracking.

## Edge Cases
- `k = 1` emits each individual number; `k = n` emits the full range once.
- Paths without enough remaining numbers eventually stop at `i > n`; this implementation does not prune those branches early.

## Complexity
- A conservative bound is $O(\sum_{d=0}^{k}\binom nd+k\binom nk)$ time, including incomplete search paths and output copies.
- $O(k)$ path/recursion space, plus $O(k\binom nk)$ result space for one call.

## Notes
- Instance-reuse risk: the result field is never cleared. Calling `combine(2, 1)` and then `combine(1, 1)` on the same object returns three entries on the second call, including the previous results.
