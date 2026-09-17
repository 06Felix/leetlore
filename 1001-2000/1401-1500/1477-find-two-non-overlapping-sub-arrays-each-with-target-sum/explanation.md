# Find Two Non-overlapping Sub-arrays Each With Target Sum

## Idea

- Since all values are positive, use a sliding window to find every subarray with sum `target`.
- Keep `best[i]` as the shortest target-sum subarray ending at or before index `i`.
- When the current window `[left...right]` has sum `target`, combine its length with `best[left - 1]`.
- That guarantees the earlier subarray ends before the current one starts.

## Why It Works

- Positive numbers make the sliding window safe: if the sum is too large, moving `left` forward can only reduce it.
- `best[left - 1]` contains the shortest valid subarray completely before `left`.
- Every valid target-sum window is considered once as the right pointer moves.
- Taking the minimum over all such pairings gives the smallest total length.

## Edge Cases

- If fewer than two target-sum subarrays exist, `ans` stays infinite and we return `-1`.
- Adjacent subarrays are allowed because they do not overlap.
- The first valid subarray cannot form a pair by itself, so we only combine when `left > 0`.

## Complexity

- Time: `O(n)`
- Space: `O(n)`

## Tags

- Sliding Window
- Dynamic Programming
- Prefix Minimum
