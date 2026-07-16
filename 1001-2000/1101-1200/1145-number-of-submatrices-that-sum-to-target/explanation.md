# Number of Submatrices That Sum to Target

## Idea

- The solution first converts each row into prefix sums across columns.
- It then fixes a left column `baseCol` and right column `j`.
- For that column band, each row contributes one compressed value: the sum between the two columns.
- Counting subarrays of these row sums with total `target` gives the number of matching submatrices for that band.

## Why It Works

- Any submatrix is uniquely identified by its left column, right column, top row, and bottom row.
- Once the columns are fixed, choosing top and bottom rows is exactly a 1D subarray sum problem.
- The hash map stores how often each prefix sum has appeared, so `sum - target` tells how many earlier prefixes form a target-sum band ending at the current row.
- Iterating all column pairs covers every possible submatrix once.

## Edge Cases

- Negative values are handled because prefix sums are counted with a map, not a sliding window.
- Single-cell matrices work through the same column-pair loop.
- `target = 0` is supported by the initial prefix count `{0: 1}`.

## Complexity

- Time: $O(n^2m)$ for `m` rows and `n` columns.
- Space: $O(m)$ for the prefix-count map per column pair.
