# Minimum Operations to Reduce X to Zero

## Idea

- Removing elements from the left and right means some middle subarray remains.
- If the removed elements sum to `x`, then the remaining middle subarray must sum to `totalSum - x`.
- To minimize removals, keep the longest subarray with sum `totalSum - x`.
- Since all numbers are positive, a sliding window can find that longest subarray.

## Why It Works

- Every valid sequence of operations removes a prefix and a suffix.
- The elements not removed are one contiguous middle subarray.
- Minimizing removed elements is the same as maximizing the length of the kept subarray.
- Positive values make the window monotonic: when the sum is too large, moving `left` forward decreases it.

## Edge Cases

- If `totalSum < x`, it is impossible to remove enough value, so return `-1`.
- If `totalSum == x`, all elements must be removed, so return `n`.
- If no subarray sums to `totalSum - x`, return `-1`.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Tags

- Sliding Window
- Prefix Sum
- Array
