# Explanation

## Idea
- Group matrix values by `row - column`, storing each group in a min-heap.
- Scan the matrix again in row-major order and replace each cell with the next minimum from its diagonal's heap.

## Why It Works
- Moving one step down-right preserves `row - column`, so the key identifies exactly one diagonal.
- Row-major traversal encounters cells of a given diagonal in increasing row order. Repeatedly polling its heap writes that diagonal in ascending order without moving values between diagonals.

## Edge Cases
- A one-cell diagonal remains unchanged.
- Duplicate values and rectangular matrices use the same grouping rule.

## Complexity
- Time: $O(RC\log(\min(R,C)+1))$ for an `R` by `C` matrix.
- Auxiliary space: $O(RC)$ for all heap entries and diagonal keys.

## Notes
- The implementation modifies and returns the input matrix.
