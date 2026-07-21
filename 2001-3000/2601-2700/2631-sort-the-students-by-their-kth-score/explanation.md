# Sort the Students by Their Kth Score

## Idea

- Sort the rows of `score` directly.
- Comparator orders rows by column `k` descending.
- Return the same matrix reference after sorting.

## Why It Works

- Each row represents one student.
- The required order depends only on `score[i][k]`.
- Sorting with `b[k] - a[k]` places larger `k`th scores first.
- Distinct scores avoid tie ambiguity.

## Edge Cases

- One student remains unchanged.
- `k = 0` sorts by the first exam.
- The matrix is mutated in place, which is acceptable because the returned matrix is the sorted result.

## Complexity

- Time: $O(m \log m)$ row comparisons.
- Space: $O(1)$ extra besides sorting implementation details.
