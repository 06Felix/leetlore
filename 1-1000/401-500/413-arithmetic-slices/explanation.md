# Explanation

## Idea

Use dynamic programming by ending index. `dp[i]` is the number of arithmetic slices that end at `i`.

If the last three numbers keep the same difference, every slice ending at `i - 1` can extend to `i`, plus the new length-three slice.

## Why It Works

An arithmetic subarray ending at `i` must have `nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]`.

When this holds, appending `nums[i]` extends all previous arithmetic slices ending at `i - 1`, and also creates `[i - 2, i - 1, i]`. So `dp[i] = dp[i - 1] + 1`.

Summing all `dp[i]` counts every arithmetic slice by its ending index.

## Edge Cases

- Arrays shorter than three return `0`.
- Equal adjacent differences of `0` are valid.
- Broken differences reset the implicit count to `0`.

## Complexity

Time: `O(n)`.

Space: `O(n)`.
