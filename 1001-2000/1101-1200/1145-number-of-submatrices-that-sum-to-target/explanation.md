# Explanation

Problem: [Number of Submatrices That Sum to Target](https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/)

## Idea

- Convert each row into in-place prefix sums so any row segment between two columns can be read in $O(1)$.
- Fix the left and right column boundaries of the submatrix.
- For those columns, collapse each row into a single segment sum and count how many vertical ranges have total `target`.
- The vertical count is the standard prefix-sum-with-frequency-map technique for subarray sum equals target.

## Why It Works

- Once two columns are fixed, every valid submatrix using those columns corresponds to one contiguous range of rows.
- The running `sum` after scanning rows is the total of all row segments seen so far between the fixed columns.
- If an earlier prefix was `sum - target`, the rows after that prefix form a submatrix whose sum is exactly `target`.
- Trying every column pair covers every possible submatrix exactly once.

## Edge Cases

- Single-cell matrices are handled by the same prefix-count logic.
- Negative values are safe because the map method does not rely on monotonic sums.
- `prefixCount` starts with `{0: 1}` so submatrices beginning at the first row are counted.

## Complexity

- Time: $O(n^2 m)$ for `m` rows and `n` columns.
- Space: $O(m)$ for the prefix frequency map.

## Notes

- The solution mutates `matrix` by replacing each row with its prefix sums.
