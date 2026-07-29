# Split Array Largest Sum

## Idea

- Binary search the answer, the maximum allowed subarray sum.
- The lower bound is the largest single element; the upper bound is the total sum.
- For a candidate limit, greedily form a new subarray whenever adding the next number would exceed the limit.

## Why It Works

- If a limit can split the array into at most `k` subarrays, any larger limit is also feasible.
- If a limit needs more than `k` subarrays, any smaller limit is infeasible.
- The greedy feasibility check minimizes the number of subarrays for a fixed limit by extending each subarray as far as possible.

## Edge Cases

- When `k = 1`, the answer is the total sum.
- When `k = nums.length`, the answer is the maximum element.
- Zero values do not affect feasibility except by contributing no sum.

## Complexity

- Time: `O(n log S)`, where `S` is the sum range between bounds.
- Space: `O(1)`.
