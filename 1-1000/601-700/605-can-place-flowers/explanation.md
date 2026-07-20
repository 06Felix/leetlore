# Explanation

Problem: [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)

## Idea

Scan the flowerbed from left to right and greedily plant a flower whenever the current plot and its needed neighbors are empty.

## Why It Works

Planting at the earliest available valid plot cannot reduce the number of future flowers: it only blocks the immediate next plot, which could not be used together with the current plot anyway. The implementation checks the boundary cases for the first and last plots separately, and for middle plots requires both neighbors and the current plot to be `0`. Each planted flower is written back as `1`, so later checks respect earlier placements.

## Edge Cases

- A single empty plot can hold one flower.
- `n = 0` returns true because the final planted count is at least zero.
- Existing flowers are never overwritten.

## Complexity

- Time: `O(m)`, where `m` is `flowerbed.length`.
- Space: `O(1)`.
