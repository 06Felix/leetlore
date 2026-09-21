# Find X Value of Array I

## Idea

- Removing a prefix and suffix leaves exactly one non-empty contiguous subarray.
- So we need to count the product remainder for every subarray.
- `prev[r]` stores how many subarrays ending at the previous index had product remainder `r`.
- For each new number, either start a new subarray or extend one of the previous subarrays.

## Why It Works

- A new single-element subarray contributes to remainder `nums[i] % k`.
- Extending a previous subarray with remainder `r` changes its remainder to `(r * nums[i]) % k`.
- `curr` therefore stores all subarrays ending at the current index grouped by product remainder.
- Adding `curr` into `ans` counts every subarray exactly once, at its ending index.

## Edge Cases

- `k = 1` works naturally, because every product has remainder `0`.
- Values larger than `k` are reduced with `num % k`.
- Single-element subarrays are counted by the direct `++curr[val]` step.

## Complexity

- Time: `O(n * k)`
- Space: `O(k)`

## Tags

- Dynamic Programming
- Modular Arithmetic
- Subarray
