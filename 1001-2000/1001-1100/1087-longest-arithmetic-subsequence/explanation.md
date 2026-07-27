# Explanation

## Idea

The solution uses dynamic programming by ending index and difference. `dp[i][d]` stores the longest arithmetic subsequence ending at index `i` with difference `d`.

Because the values are in a bounded range, differences from `-500` to `500` are shifted by `+500` and stored in an array of size `1001`.

## Why It Works

For every pair `j < i`, the difference is fixed as `nums[i] - nums[j]`. Any arithmetic subsequence ending at `j` with that same difference can be extended by `nums[i]`.

If no such subsequence existed before, the pair `(j, i)` itself creates a length-`2` subsequence. The code stores the best value for each `(i, difference)` and tracks the maximum seen.

## Edge Cases

- Pairs initialize subsequences of length `2`.
- Equal values use difference `0`, stored at offset index `500`.
- The fixed `1001` difference array relies on the problem constraint that values are between `0` and `500`.

## Complexity

Time: `O(n^2)`.

Space: `O(n * 1001)`.
