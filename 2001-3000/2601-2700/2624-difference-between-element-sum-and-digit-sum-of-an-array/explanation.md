# Explanation

Problem: [Difference Between Element Sum and Digit Sum of an Array](https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/)

## Idea

Accumulate two totals in one pass: the normal element sum and the sum of decimal digits for each element. Return the absolute difference between those totals.

## Why It Works

The element sum is computed directly by adding each `n`. The helper `sod` repeatedly takes `n % 10` and divides by `10`, which visits every decimal digit exactly once, so adding those helper results gives the required digit sum. The final `Math.abs` matches the requested absolute difference.

## Edge Cases

- Single-digit numbers contribute the same value to both sums.
- All inputs are positive, so the digit loop does not need negative handling.

## Complexity

- Time: `O(n d)`, where `d` is the maximum number of digits in an input value.
- Space: `O(1)`.
