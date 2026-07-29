# Subarray Product Less Than K

## Idea

- Use a sliding window with product `p`.
- Expand the right boundary by multiplying in `nums[r]`.
- While the product is too large, divide out values from the left.
- Every suffix of the current valid window ending at `r` is counted.

## Why It Works

- All numbers are positive, so removing elements from the left can only reduce the product.
- After shrinking, every subarray ending at `r` and starting between `l` and `r` has product less than `k`.
- There are exactly `r - l + 1` such subarrays.

## Edge Cases

- If `k <= 1`, no positive-product subarray can be strictly less than `k`.
- Single-element windows are counted normally.
- The window may shrink multiple times after adding a large number.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
