# Explanation

Problem: [Biggest Single Number](https://leetcode.com/problems/biggest-single-number/)

## Idea

Group equal numbers, keep only groups with count `1`, then take the maximum remaining number.

## Why It Works

A single number is defined as a value that appears exactly once. The inner query groups by `num` and `HAVING COUNT(num) = 1` filters to exactly those values. The outer `MAX(num)` returns the largest single value. If the inner query returns no rows, `MAX` returns `NULL`, matching the required output.

## Edge Cases

- All duplicated values produce `NULL`.
- Negative or positive values are handled by the same maximum aggregation.

## Complexity

- Time: `O(n)` grouping work in a typical execution plan.
- Space: `O(u)` for distinct-number groups.
