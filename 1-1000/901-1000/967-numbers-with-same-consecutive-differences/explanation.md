# Explanation

## Idea
- Start a depth-first search from each leading digit 1 through 9.
- Append the last digit plus or minus `k` when the result remains in 0 through 9; collect the number when it has `n` digits.

## Why It Works
- Every appended digit satisfies the required adjacent difference, and the nonzero starting digit prevents leading zeros.
- Every valid next digit is one of the two explored choices, so no valid number is missed.
- When `k` is zero, suppress the second branch to avoid producing each number twice.

## Edge Cases
- Zero may appear after the first digit.
- A branch with no legal next digit contributes no result; nine-digit outputs still fit in `int`.

## Complexity
- Time: $O(9 \cdot 2^{n-1})$ as an upper bound on the branching search and output copying.
- Space: $O(R + n)$ for `R` collected results and the recursion stack, in addition to the returned array.

## Notes
- The result list is an instance field and is not cleared. Reusing the same `Solution` object for multiple calls would retain earlier results; the implementation assumes one call per instance.
