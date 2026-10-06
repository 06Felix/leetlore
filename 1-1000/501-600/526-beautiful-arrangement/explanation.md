# Explanation

## Idea
- Fill positions from 1 through `n`, representing used numbers with a bitmask.
- Try each unused number only when it divides the current position or the position divides it.
- Memoize the number of completions for each `(position, mask)` state; restore the referenced mask after each recursive choice.

## Why It Works
- The divisibility test enforces the arrangement condition at every assigned position.
- Marking a chosen number prevents reuse; reaching position `n + 1` means a complete valid permutation and contributes one.
- Every valid permutation follows exactly one sequence of choices. States with the same used numbers and next position have identical remaining choices.

## Edge Cases
- `n = 1` yields one arrangement.
- Bit zero is unused because numbers are indexed from 1; allocating $2^{n+1}$ masks keeps bit `n` representable.

## Complexity
- Time: $O(n \cdot 2^n)$ for reachable states and candidate scans, including the table's initialization cost.
- Auxiliary space: $O(n \cdot 2^n)$ for the explicitly allocated two-dimensional table, plus $O(n)$ recursion depth.

## Notes
- This is the imported C++ implementation. Its table retains a position dimension even though the used-bit count determines that position.
