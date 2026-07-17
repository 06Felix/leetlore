# Explanation

## Idea

- Count subarrays with sum at most `k` using a sliding window helper `count(nums, k)`.
- The exact number with sum `goal` is `count(goal) - count(goal - 1)`.
- This works because the array is binary, so window sums only increase when the right pointer moves and can be fixed by moving the left pointer.

## Why It Works

- For each right endpoint, the helper keeps the smallest valid left endpoint such that the current sum is at most `k`.
- Every subarray ending at `r` and starting from `l` through `r` is then valid, adding `r - l + 1`.
- Subtracting sums at most `goal - 1` removes all smaller-sum subarrays, leaving only sum exactly `goal`.

## Edge Cases

- `goal = 0` works because `count(nums, -1)` contributes `0`.
- Runs of zeroes are counted naturally by the sliding window.
- Single-element arrays are handled by the same endpoint counting.

## Complexity

- Time: $O(n)$, two linear sliding-window passes.
- Space: $O(1)$.
