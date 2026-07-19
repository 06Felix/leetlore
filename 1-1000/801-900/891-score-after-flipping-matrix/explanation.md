# Explanation

Problem: [Score After Flipping Matrix](https://leetcode.com/problems/score-after-flipping-matrix/)

## Idea

Assume every row is flipped if needed so its first bit becomes `1`. Then, for each later column, count how many rows would contain `1` after those row flips and take the better of keeping or flipping the column.

## Why It Works

The first column has the highest binary weight, so making every first bit `1` is always optimal. Instead of mutating rows, the implementation treats a later cell as `1` after row normalization when `grid[i][j] == grid[i][0]`. For each column, a column flip can choose between that count and its complement, so the best contribution is `max(ct, m - ct)`. Building `ans` left to right as binary digits adds each column's optimal contribution.

## Edge Cases

- A `1 x 1` grid returns `1` because the first column is forced to all ones.
- No actual flips are needed; the code computes the best normalized result directly.

## Complexity

- Time: `O(mn)`.
- Space: `O(1)`.
