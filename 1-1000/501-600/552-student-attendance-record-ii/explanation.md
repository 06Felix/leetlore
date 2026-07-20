# Explanation

Problem: [Student Attendance Record II](https://leetcode.com/problems/student-attendance-record-ii/)

## Idea

First count valid records made only from `P` and `L`, where no three `L`s are consecutive. Then add the records that contain exactly one `A` by placing the `A` at every possible position and multiplying the valid left and right parts.

## Why It Works

`PorL[i]` stores the number of length-`i` records using only `P` and `L` with no `LLL`. `P[i]` stores records of length `i` ending in `P`, so `P[i] = PorL[i - 1]`. A valid `P/L` string can end in `P`, `LP`, or `LLP` when viewed by its final block, giving `PorL[i] = P[i] + P[i - 1] + P[i - 2]`.

Records with no `A` contribute `PorL[n]`. For exactly one `A` at index `i`, both sides must be independently valid `P/L` strings, so the contribution is `PorL[i] * PorL[n - i - 1]`. Summing all positions counts every award-eligible record exactly once.

## Edge Cases

- `n = 1` works from the initialized base values.
- The modulo is applied during DP and summation to keep values bounded.

## Complexity

- Time: `O(n)`.
- Space: `O(n)`.
