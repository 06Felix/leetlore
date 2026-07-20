# Explanation

Problem: [Max Number of K-Sum Pairs](https://leetcode.com/problems/max-number-of-k-sum-pairs/)

## Idea

Sort the numbers and use two pointers. Pair the smallest and largest remaining values when they sum to `k`; otherwise move the pointer that can move the sum toward `k`.

## Why It Works

After sorting, if `nums[l] + nums[r]` is less than `k`, the smallest value cannot pair with any value at or below `r`, so `l` must move right. If the sum is greater than `k`, the largest value cannot pair with any value at or above `l`, so `r` must move left. When the sum equals `k`, using both values is optimal and both are removed. This greedily counts the maximum number of disjoint valid pairs.

## Edge Cases

- Duplicate values are handled naturally by sorted positions.
- If no pair sums to `k`, the answer remains `0`.

## Complexity

- Time: `O(n log n)` for sorting.
- Space: `O(1)` extra beyond the sort implementation.
