# Explanation

Problem: [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)

## Idea

Compute the total sum first. Then scan left to right while maintaining the sum to the left and the remaining sum to the right.

## Why It Works

Before checking index `i`, the implementation subtracts `arr[i]` from the remaining total, so `s` becomes the sum strictly to the right. `ls` is maintained as the sum strictly to the left. If `ls == s`, index `i` satisfies the pivot condition and is returned immediately, which gives the leftmost pivot. If no index matches, the method returns `-1`.

## Edge Cases

- Index `0` works because the left sum starts at `0`.
- Negative numbers are handled naturally by sums.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
