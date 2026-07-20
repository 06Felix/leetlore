# Explanation

Problem: [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/)

## Idea

Use a fixed-size sliding window of length `k`. Track the current window sum and the maximum sum seen, then divide by `k`.

## Why It Works

Every valid subarray has exactly length `k`, so maximizing average is the same as maximizing sum. The first loop computes the sum of the first window. Each later step adds the new rightmost value and removes the value that just left the window, producing the next length-`k` sum in `O(1)`. Since every length-`k` window is considered, the largest stored sum gives the maximum average.

## Edge Cases

- If `k == nums.length`, only the first window is used.
- Negative values are handled because the maximum is initialized to the first window sum.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
