# Explanation

## Idea
- Map each numeric value to all indices containing it.
- `dp[i][j]` counts arithmetic subsequences of length at least three ending with indices `j, i`.
- For each pair `j < i`, look up the required previous value $2 \cdot nums[j] - nums[i]$ and consider its indices `k < j`.

## Why It Works
- Each matching `k` creates the triple `k, j, i` and extends every subsequence counted by `dp[j][k]`.
- The recurrence adds `dp[j][k] + 1`, counting both extensions and the new triple.
- Every valid subsequence has one unique final pair, so summing all table entries counts it exactly once.

## Edge Cases
- Fewer than three elements yield zero.
- Repeated values allow difference-zero subsequences; the strict index order distinguishes their choices.
- Computing the required value as `long` avoids overflow for extreme input integers.

## Complexity
- Time: $O(n^3)$ worst case, because every pair can scan a list of $O(n)$ matching-value indices.
- Auxiliary space: $O(n^2)$ for the table plus $O(n)$ for the value-to-indices map.

## Notes
- The map improves searches for sparse repeated values but does not make this implementation quadratic. Counts use `int`, relying on the problem's answer bound.
