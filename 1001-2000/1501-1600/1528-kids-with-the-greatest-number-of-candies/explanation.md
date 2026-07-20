# Explanation

Problem: [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

## Idea

Find the current maximum candy count. Then, for each kid, check whether their candies plus `extraCandies` reaches at least that maximum.

## Why It Works

A kid can have the greatest number after receiving all extra candies exactly when `candies[i] + extraCandies` is no smaller than every original candy count. The maximum original count is enough to represent that condition. The implementation computes it once, then emits one boolean per kid based on the comparison.

## Edge Cases

- Multiple kids can return `true` because ties for greatest are allowed.
- A kid who already has the maximum always returns `true`.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for the returned list.
