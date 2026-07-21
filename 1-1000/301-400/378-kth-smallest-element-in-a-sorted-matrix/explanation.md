# Explanation

Problem: [Kth Smallest Element in a Sorted Matrix](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)

## Idea

- Binary search the answer value between the smallest and largest matrix entries.
- For a candidate `mid`, count how many entries are `<= mid`.
- The count is computed with a staircase scan: keep a column pointer that only moves left as rows increase.
- If at least `k` values are `<= mid`, the answer is `mid` or smaller; otherwise it is larger.

## Why It Works

- The predicate `count(<= x) >= k` is monotonic: once true for some value, it stays true for all larger values.
- Binary search over values therefore finds the smallest value with at least `k` matrix entries not greater than it.
- That smallest value is exactly the kth smallest element.
- The staircase count works because rows and columns are sorted, so when `matrix[i][j] > mid`, all lower values in that column at larger rows are also too large for that row position or further right.

## Edge Cases

- Duplicate values are handled because the count includes every cell `<= mid`.
- `k = 1` and `k = n^2` converge to the matrix minimum and maximum.

## Complexity

- Time: $O(n \log R)$, where `R` is the numeric value range.
- Space: $O(1)$.

## Notes

- The implementation assumes a square `n x n` matrix, matching the problem constraints.
