# Burst Balloons

## Idea

- Add sentinel balloons with value `1` at both ends.
- Let `dp[i][j]` be the maximum coins from bursting all balloons in interval `[i, j]`.
- Fill intervals by increasing length.
- For each interval, try every `k` as the last balloon burst inside it.

## Why It Works

- If `k` is the last balloon in `[i, j]`, its neighbors at that moment are fixed: `i - 1` and `j + 1`.
- The left and right subintervals are independent before bursting `k` last.
- Therefore the best value is `dp[i][k - 1] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j + 1]`.
- Trying all possible last balloons finds the optimum for each interval.

## Edge Cases

- One balloon uses both sentinels.
- Zero-valued balloons are handled by the same product formula.
- Empty subintervals contribute `0` through default DP values.

## Complexity

- Time: $O(n^3)$.
- Space: $O(n^2)$.
